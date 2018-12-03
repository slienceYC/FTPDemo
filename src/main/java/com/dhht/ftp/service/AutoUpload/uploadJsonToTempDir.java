package com.dhht.ftp.service.AutoUpload;

import com.alibaba.fastjson.JSON;
import com.dhht.ftp.model.UseDepartmentModel;
import com.dhht.ftp.service.config.FtpConfig;
import com.dhht.ftp.service.UseDepartmentService.UseDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Calendar;

@Component
public class uploadJsonToTempDir {

    @Autowired
    private FtpConfig ftpConfig;
    //当前时间
    private long currentTime = 0;
    //当前时间要保存文件的总量
    private int totalInCurrentTim = 0;

    @Autowired
    private UseDepartmentService useDepartmentService;

    @Scheduled(fixedRate = 10000)
    public void autoCreateDate(){
       UseDepartmentModel useDepartmentModel =  useDepartmentService.createUseDepartment();
       writeJsonFile(useDepartmentModel);
       System.out.println(useDepartmentModel.toString());
    }

    private void writeJsonFile(Object dataObj) {
        String objJson = JSON.toJSONString(dataObj);
        File file = new File(ftpConfig.getTEMP_DATA_DIR()+ "/" + generateFileName()+".json");
        FileOutputStream fileOutputStream = null;
        FileChannel channel = null;
        BufferedOutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            //进行加锁，以便上传部分的代码能够判断文件是否已经输出完毕。可能有更好的解决方案
            channel = fileOutputStream.getChannel();
//    		channel.lock();

            outputStream = new BufferedOutputStream(fileOutputStream);
            outputStream.write(objJson.getBytes("UTF-8"));
            outputStream.flush();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                channel.close();
                fileOutputStream.close();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

     private synchronized String generateFileName() {
        long datetime = Calendar.getInstance().getTimeInMillis();
        if(datetime == currentTime) {//获取到的时间与上次操作的时间相同，数量自增，否则归零
            totalInCurrentTim++;
        }
        else {
            currentTime = datetime;
            totalInCurrentTim = 0;
        }
        return String.valueOf(datetime) + String.format("%03d", totalInCurrentTim);
    }

}

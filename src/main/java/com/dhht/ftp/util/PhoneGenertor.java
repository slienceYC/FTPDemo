package com.dhht.ftp.util;

import java.util.Random;

public class PhoneGenertor {
    public static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }

    /***
     * 随机生成手机号码
     * @return
     */
    public static String GenerateMobilephone() {
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String thrid=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+thrid;
    }

    /**
     * 生成八位座机号
     * @return
     */
    public static String GenerateTelphone(){
        StringBuilder str=new StringBuilder();//定义变长字符串
        Random random=new Random();
        for(int i=0;i<8;i++){
            str.append(random.nextInt(10));
        }
        return "0571-" + str.toString();
    }

}

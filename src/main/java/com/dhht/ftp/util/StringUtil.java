package com.dhht.ftp.util;




import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串操作
 * @author gql
 *
 */
public class StringUtil {


    @Value("${trackerPort}")
    public static String trackerPort;

    @Value("${trackerServer}")
    public static String trackerServer;
	/**
	 * 判断字符串是否为空
	 * @param paramStr 待判断字符串
	 * @return 为空返回true 不为空返回false
	 */
	public static boolean isNull(String paramStr){
		boolean result = false;
		if(paramStr == null || paramStr.isEmpty()){
			result = true;
			return result;
		}
		paramStr = paramStr.trim();
		if("".equals(paramStr) || "null".equals(paramStr) || "NULL".equals(paramStr)){
			result = true;
			return result;
		}
		return result;
	}
	/**
	 * 字符串非空判断
	 * 属于空的：（NULL，‘’， ‘null’,'NULL'）
	 * @param paramStr  待判断的字符串
	 * @return  true：非空，false：空
	 */
	public static boolean isNotNull(String paramStr){
		if(paramStr == null){
			return false;
		}
		if(paramStr.isEmpty()){
			return false;
		}
		paramStr = paramStr.trim();
		if(paramStr.equals("")){
			return false;
		}
		if(paramStr.equals("null")){
			return false;
		}
		if(paramStr.equals("NULL")){
			return false;
		}
		
		return true;
	}
	
	/**
	 * 对字符串进行处理，把'null'、'NULL'处理成''空字符串，非空的字符串会执行trim
	 * @param paramStr  待处理的字符串
	 * @return  处理后的字符串
	 */
	public static String stringNullHandle(String paramStr){
		if(isNotNull(paramStr)){
			return paramStr.trim();
		}else{
			return "";
		}
	}


    /**
     * 处理页面传递的特殊字符，将<>()&;:/\'"替换为" "
     *
     * @param source 处理前的字符串
     * @return 处理后的字符串
     */
    public static String rightfulString(String source) {
        if (source == null) {
            return "";
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            switch (c) {
                case '<':
                    buffer.append(" ");
                    break;
                case '>':
                    buffer.append(" ");
                    break;
                case '(':
                    buffer.append(" ");
                    break;
                case ')':
                    buffer.append(" ");
                    break;
                case '&':
                    buffer.append(" ");
                    break;
                case ':':
                    buffer.append(" ");
                    break;
                case ';':
                    buffer.append(" ");
                    break;
                case '\'':
                    buffer.append(" ");
                    break;
                case '\"':
                    buffer.append(" ");
                    break;
                case '\\':
                    buffer.append(" ");
                    break;
                case '/':
                    buffer.append(" ");
                    break;
                case '*':
                    buffer.append(" ");
                    break;
                default:
                    buffer.append(c);
            }
        }
        return buffer.toString();
    }

    /**
     * 处理区域ID
     * @param ID 区域ID
     * @return 返回一个字符串数组
     * 数组第一个对应省ID，第二个对应市ID，第三个对应区ID
     */
    public static String[] DistrictUtil(String ID){
        String DistrictID[] = new String[3];
        String id = ID.toString();
        DistrictID[0] = id.substring(0,2);
        DistrictID[1] = id.substring(2,4);
        DistrictID[2] = id.substring(4,6);
        return DistrictID;
    }

    /**
     * 处理返回区域码，用于模糊查询
     * @param id
     * @return
     */
    public static String getDistrictId(String id){
        String districtIds[] = StringUtil.DistrictUtil(id);
        String districtId = null;
        if(districtIds[1].equals("00")&&districtIds[2].equals("00")){
            districtId = districtIds[0];
        }else if(!districtIds[1].equals("00")&&districtIds[2].equals("00")){
            districtId = districtIds[0]+districtIds[1];
        }else {
            districtId = id;
        }
        return districtId;
    }

    /**
     * 用于三级联动区域id
     * @param districtId
     * @return
     */
    public static List<String> getDistrictIds(String districtId){
        List<String> districtIds = new ArrayList<>();
        String temp[] = DistrictUtil(districtId);
        districtIds.add(temp[0]+"0000");
        districtIds.add(temp[0]+temp[1]+"00");
        districtIds.add(districtId);
        return districtIds;
    }

    /**
     * 将字符串数组处理成用; 号分割的字符串
     * @param str
     * @return
     */
    public static String getString(String[] str){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<str.length;i++){
            stringBuffer.append(str[i]+",");
        }
        return stringBuffer.toString();
    }


    /**
     * 将字符串转成字符串数组
     * @param str
     * @return
     */
    public static String[] toStringArray (String str){
        return str.split(",");
    }

    public static String[] toStringArray1 (String str){
        return str.split(";");
    }

    /**
     * 6位简单密码
     *
     * @return
     */
    public static String createRandomVcode() {
        //密码
        String vcode = "";
        for (int i = 0; i < 6; i++) {
            vcode = vcode + (int) (Math.random() * 9);
        }
        return vcode;
    }

    /**
     * url处理类,返回完整的url
     * @param url
     * @return
     */
    public static String getAbsolutePath(String url){
        String allUrl = "http://"+trackerServer+":"+trackerPort+"group1/"+url;
        return allUrl;
    }

    /**
     * 相对的路径
     * @param url
     * @return
     */
    public static String getRelativePath(String url){
        String ftpUrl = "http://"+trackerServer+":"+trackerPort+"group1/";
        String simpleUrl = url.replace(ftpUrl,"");
        return simpleUrl;
    }

    /**
     * 将实体类字段处理成数据库字段
     * @return
     */
    public static String getDateBaseColumn(String str) {
        String ss = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                ss += "_" + charArray[i];
            } else {
                ss += charArray[i];
            }
        }
        return ss.toLowerCase();
    }
}

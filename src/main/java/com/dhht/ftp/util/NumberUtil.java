package com.dhht.ftp.util;

import java.util.Random;

public class NumberUtil {

    /**
     * 生成一个20--500的数字
     * @return
     */
    public static  String generatorNumber(){
        Random random = new Random();
        Integer num = random.nextInt(500)+20;
        return num.toString();
    }
}

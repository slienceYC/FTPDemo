package com.dhht.ftp.util;

import java.util.Random;

public class SocialCodeCenerator {

    /**
     * 字母和数字的字符合集
     *
     * @return
     */
    public static char[] charArray() {
        int i = 1234567890;
        String s = "qwertyuiopasdfghjklzxcvbnm";
        String S = s.toUpperCase();
        String word = S + i;
        char[] c = word.toCharArray();
        return c;
    }

    public static String genertorCode(String districtId) {
        Random rd = new Random();
        char[] c = charArray();
        String temp = "";
        String socialCode = "";
        for (int k = 0; k <10; k++) {
            int index = rd.nextInt(c.length);
            temp += c[index];
        }
        socialCode = "92" + districtId + temp;
        return socialCode;
    }

    public static void main(String[] args) {
        for (int i =0;i<10;i++) {
            System.out.println(genertorCode("330108"));
        }
    }
}

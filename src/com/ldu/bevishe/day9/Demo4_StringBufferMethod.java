package com.ldu.bevishe.day9;

public class Demo4_StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello,world!");
        String str = (String) sb.subSequence(0,5);
//        String str = sb.substring(0,5);
        System.out.println(str);

    }
}

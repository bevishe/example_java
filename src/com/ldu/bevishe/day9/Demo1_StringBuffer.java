package com.ldu.bevishe.day9;

public class Demo1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());          //容器中的字符个数
        System.out.println(sb.capacity());          //容器的初始容量

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("hi");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

    }
}

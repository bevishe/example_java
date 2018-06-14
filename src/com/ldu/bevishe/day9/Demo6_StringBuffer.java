package com.ldu.bevishe.day9;

public class Demo6_StringBuffer {
    public static void main(String[] args) {
        /*基本数据类型的值传递，不改变其值
        和引用数据类型的值传递，改变其值
        String虽然是引用数据类型，当他当做参数传递时和基本数据类型是一样的
        而StringBuffer做参数是是可以改变其值的
        * */
        String s = "world";
        System.out.println(s);
        change(s);
        System.out.println(s);

        StringBuffer sb = new StringBuffer("hi");
        change(sb);
        System.out.println(sb);
    }

    public static void change(StringBuffer stringBuffer){
        stringBuffer.append("hello");
    }

    public static void change(String s){
        s = s + "hi";
    }
}

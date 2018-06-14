package com.ldu.bevishe.day9;
//StringBuffer和String的转换
public class Demo5_StringBuffer {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
    }

    //使用StringBuffer中的subString方法将StringBuffer对象转化为String对象
    public static void method5() {
        StringBuffer sb = new StringBuffer("hello");
        String str = sb.substring(0,sb.length());
        System.out.println(str);
    }

    //使用StringBuffer中的toString方法将StringBuffer对象转化为String对象
    public static void method4() {
        StringBuffer sb = new StringBuffer("hello");
        String str =  sb.toString();
        System.out.println(str);
    }

    //通过String的构造方法将StringBuffer对象转化为String对象
    public static void method3() {
        StringBuffer sb = new StringBuffer("hi");
        String str = new String(sb);
        System.out.println(str);
    }

    //使用append方法将String变为String对象
    public static void method2() {
        StringBuffer sb = new StringBuffer();
        sb.append("hi");
        System.out.println(sb);
    }

    //通过构造方法将String转换为StringBuffer对象
    public static void method1() {
        StringBuffer sb = new StringBuffer("hi");
        System.out.println(sb);
    }
}

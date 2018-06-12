package com.ldu.bevishe.day8;

//String类中的获取方法
public class Demo5_String {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();

    }

    //从指定的索引处开始截取一个新的字符串，默认的是到原字符串的结尾
    public static void method5() {
        String str1 = "helloworld";
        String str = str1.substring(5);
        System.out.println(str);
    }

    //从某个索引开始查找字符串中的某个字符
    public static void method4() {
        String s1 = "helloworld";
        System.out.println(s1.indexOf('l',3));
    }

    //查找第一个出现该字符的索引
    public static void method3() {
        String s1 = "helloworld";
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.indexOf("ow"));
    }

    //根据索引来找对应的字符
    public static void method2() {
        String s1 = "helloworld";
        System.out.println(s1.charAt(2));
    }

    //获取字符串的长度
    public static void method1() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());
    }
}

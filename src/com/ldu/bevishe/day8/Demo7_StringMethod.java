package com.ldu.bevishe.day8;

public class Demo7_StringMethod {
    public static void main(String[] args) {
        //method1();
        //method2();
        method3();
    }

    //判断两个字符串的大小
    public static void method3() {
        String s1 = new String("hi");
        String s2 = "you";
        String s3 = "Hi";
        int i = s1.compareTo(s2);//等号是用equals来判断的
        int j = s1.compareTo(s3);
        System.out.println(i);
        System.out.println(j);
        int k = s1.compareToIgnoreCase(s3);
        System.out.println(k);
    }

    //去除字符串中前和尾部的空格
    public static void method2() {
        String s1 = "  hi , what is your name ?    ";
        String s2 = s1.trim();
        System.out.println(s1);
        System.out.println(s2);
    }

    //replace(old,new) String类中的一个替换方法
    public static void method1() {
        String s1 = "hi,how are me";
        String s2 = s1.replace("me","you");
        System.out.print(s2);
    }
}

package com.ldu.bevishe.day8;

public class Demo6_String {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        //method6();
    }

    public static void method6() {
        String s = "hello";             //使用+拼接更加强大，+号可以是字符串和任意对象类型拼接
        String s2 = s.concat("world");     //而使用concat必须是字符串和字符串拼接
        System.out.println(s2);
    }

    //将字符串中的字母全部转换成大写，全部转换成小写
    public static void method5() {
        String s1 = "HELLOWORLD";
        String s2 = s1.toLowerCase();
        System.out.print(s2);
        String s3 = s2.toUpperCase();
        System.out.println(s3);
    }

    //将任意对象转换成字符串
    public static void method4() {
        Person p = new Person("张三丰",23);    //调用的是对象的toString（）方法
        System.out.println(String.valueOf(p));
    }

    //将字符数组转换为字符串
    public static void method3() {
        char[] arr = {'a','b','c'};
        String s1 = String.valueOf(arr);//底层是由String类的构造方法完成的
        System.out.println(s1);
        String s2 = String.valueOf(100);
        System.out.println(s2);
    }

    //将字符串转换为字符数组
    public static void method2() {
        String s = "helloworld";
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //将字符串转换为字节数组，编码的过程
    /*gbk码表中一个中文代表两个字节
    gbk码表特点，中文的第一个字节肯定是负数
    * */

    public static void method1() {
        String s1 = "abc";
        byte[] arr = s1.getBytes();
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

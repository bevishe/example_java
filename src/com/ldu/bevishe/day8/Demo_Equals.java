package com.ldu.bevishe.day8;

import com.ldu.bevishe.day6.Student1;

public class Demo_Equals {
    /*Object 中的equals是比较对象的地址是否相等，开发中没有什么实际意义
    需要对其重写，比较对象的属性

    ==和equals：
        共同点：都可以作比较，返回值是boolean
        区别：
               ==是比较运算符，既可以比较基本数据类型，也可以比较引用的数据类型，基本数据类型
               比较的是值，引用数据类型比较的是地址值
               equals只可以比较引用数据类型，在没重写之前比较的是地址值，底层依赖的是==，我们一般需要对其进行重写
               ，String对象已经对equals进行了重写，比较的是两个字符串是否一样
    * */
    public static void main(String[] args) {
        Student1 s1 = new Student1("zhangsna",23);
        Student1 s2 = new Student1("zhangsna",23);
        Student1 s3 = s1;
        boolean bol = s1.equals(s2);
        boolean bol2 = s1.equals(s3);
        System.out.println(bol);
        System.out.println(bol2);
    }
}

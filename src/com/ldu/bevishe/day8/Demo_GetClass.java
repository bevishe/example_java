package com.ldu.bevishe.day8;

import com.ldu.bevishe.day6.Student1;

public class Demo_GetClass {
    public static void main(String[] args) {
        Student1 s = new Student1("张三",23);
        Class clazz = s.getClass();         //获取该对象的字节码文件
        String name = clazz.getName();
        System.out.println("name = "+name);
    }
}

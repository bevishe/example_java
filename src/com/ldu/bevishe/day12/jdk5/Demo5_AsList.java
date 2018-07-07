package com.ldu.bevishe.day12.jdk5;

import java.util.Arrays;
import java.util.List;

public class Demo5_AsList {
    public static void main(String[] args) {
        //method1();
        //method2();
        //基本数据类型的数组转换成集合，会将整个数组看成一个集合对象，但是也可以将整数数组转换成单个的元素，可以使用其相应的包装类来实现
        Integer[] arr = {12,12421,312,3121312,232};
        System.out.println(Arrays.asList(arr));

    }

    public static void method2() {
        String[] str = {"fds","fds"};
        List list = Arrays.asList(str);
        System.out.println(list);
    }

    public static void method1() {
        int[] arr = {321,32,532,321,2};
        List<int[]> list = Arrays.asList(arr);
        System.out.println(list);//int是基本数据类型，这是将整个int数组看成是一个对象来存储在list集合之中
    }
}

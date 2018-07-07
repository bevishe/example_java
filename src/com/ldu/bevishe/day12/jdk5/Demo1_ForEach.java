package com.ldu.bevishe.day12.jdk5;

public class Demo1_ForEach {
    public static void main(String[] args) {
        //增强for循环
        int[] arr = {12, 32, 42, 23, 234};
        for (int a : arr) {
            System.out.println(a);
        }

        String[] str = {"fdsa", "fdsaf"};
        for (String s : str) {
            System.out.println(s);
        }
    }
}

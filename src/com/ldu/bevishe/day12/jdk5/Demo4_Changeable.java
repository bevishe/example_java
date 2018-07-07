package com.ldu.bevishe.day12.jdk5;

public class Demo4_Changeable {
    public static void main(String[] args) {
        int[] arr = {12,423,523346,23242,32};
        print(arr);
        myPrint(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void myPrint(int ...arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

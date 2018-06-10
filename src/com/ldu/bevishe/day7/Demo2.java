package com.ldu.bevishe.day7;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        change(a,b);
    }

    public static void change(int a,int b){
        System.out.println("a"+a+",b"+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a"+a+",b"+b);
    }
}

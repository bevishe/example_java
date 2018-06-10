package com.ldu.bevishe.day30;

public class Demo_Test {
    public static void main(String[] args) {
        Demo.print1();
    }
}

class Demo {
    int num1 = 10;
    static int num2 = 20;

    public static void print1(){
//        System.out.println(num1);
        System.out.println(num2);

    }

    public void print2(){
        System.out.println(num1);
        System.out.println(num2);
    }
}

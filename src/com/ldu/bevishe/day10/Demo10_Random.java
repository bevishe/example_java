package com.ldu.bevishe.day10;

import java.util.Random;

public class Demo10_Random {
    public static void main(String[] args) {
        //method1();
        //method2();
        Random ran = new Random();
        for (int i = 0; i < 40; i++) {
            System.out.println(ran.nextInt(10));    //生成的是0-（n-1）范围内的随机数，不包含n
        }

    }

    public static void method2() {
        //值是通过种子计算出来的，每次第一次都是一样的
        Random ran = new Random(1000);
        int a = ran.nextInt();
        int b = ran.nextInt();
        System.out.println(a);
        System.out.println(b);
    }

    public static void method1() {
        Random ran = new Random();              //使用的是纳秒值
        for (int i = 0; i < 100; i++) {
            System.out.println(ran.nextInt());
        }
    }
}

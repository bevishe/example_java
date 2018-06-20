package com.ldu.bevishe.day10;

public class Demo9_Math {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
    }

    //ceil和floor
    public static void method3() {
        System.out.println(Math.PI);
        //ceil向上取整，但结果是一个double值
        //floor 向下取整，但结果也是一个double值
        System.out.println(Math.ceil(243.234));
        System.out.println(Math.floor(75843.32));
    }

    //求1-100之类的随机值
    public static void method2() {
        int random = (int)(Math.random()*100) + 1;          //包括0.0不包括1.0   另外一个作用是四舍五入
        System.out.println(random);
    }

    //返回两者之间的较大值
    public static void method1() {
        int a = 10,b = 54;
        int max = Math.max(a,b);
        System.out.println(max);
    }
}

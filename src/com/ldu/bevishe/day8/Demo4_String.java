package com.ldu.bevishe.day8;
//String类中的比较方法

public class Demo4_String {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    public static void method4() {
        /* “”和null的区别
            “”是字符串常量，同时也是一个String类的对象，可以调用String类中的方法
            null是空常量，不能调用任何的方法，否则会出现空指针异常，null常量可以给任意的引用数据类型赋值
        * */
        String s1 = " ";
        String s2 = "";
        String s3 = null;
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        //System.out.println(s3.isEmpty());     会报空指针异常
    }

    //判断字符串是否以某字符串开始，判断字符串是否以某字符串结尾
    public static void method3() {
        String s1 = "HelloWorld";
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("ld"));
    }

    //判断字符串中是否包含“ll“字符串
    public static void method2() {
        String s1 = "helloworld";
        System.out.println(s1.contains("ll"));
    }

    //区分大小写比较和不区分大小写比较
    public static void method1(){
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "HelloWorld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("******************");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }


}

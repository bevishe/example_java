package com.ldu.bevishe.day9;

public class Demo4_JDK5 {
    public static void main(String[] args) {
        int x = 100;
        Integer i = new Integer(x); //i中记录的是地址  //将基本数据类属性包装类型     装箱

        int y = i.intValue();       //就对象转换为基本数据类型   拆箱

        //jdk1.5之后 自动装箱，拆箱
        Integer i2 = 100;
        int z = i2 + 200;
        System.out.println(z);

        //会爆出空指针异常，因为底层会用x2调用intValue（），但是x2是null，用null调用就会出现空指针异常
        Integer x2 = null;
        int a = x2 + 100;
        System.out.println();
    }
}

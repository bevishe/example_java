package com.ldu.bevishe.day9;
//测试StringBuffer中的
public class Demo2_StringBuffer {
    public static void main(String[] args) {
        /*
        注意：StringBuffer是一个可变的字符序列，下列操作的都是同一个对象，而String对象是不可变的
        若对String重新赋值，则原来的String对象就变成了垃圾被回收了
        StringBuffer是字符串缓冲区，当new的时候是在堆内存创建了一个对象，底层是一个长度为16的字符数组
        当调用添加的方法时，不会重新创建对象，在不断的向原缓冲区添加字符
        * */

        //method1();
        StringBuffer sb = new StringBuffer("youme");
        sb.insert(3,"hi");
        System.out.println(sb);
    }



    public static void method1() {
        StringBuffer sb = new StringBuffer();

        StringBuffer sb2 = sb.append(true);
        System.out.println(sb.toString());          //StringBuffer中重写了toString方法
        System.out.println(sb2);
    }
}

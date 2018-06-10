package com.ldu.bevishe.day25;

public class Demo2_Operator {
    public static void main(String[] args) {
        //一个数据对另外一个数据位异或两次，数据不变
        System.out.println(5^10^10);
        System.out.println(10^5^10);
        //将两个数据进行交换，不需要定义第三方变量
        int x = 10 ;
        int y = 5 ;
        //需要第三方变量
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x +"," +"y = "+ y);
        //不需要定义第三变量,有弊端，有可能超出int的取值范围
        int x2 = 10;
        int y2 = 5;
        x2 = x2 + y2;
        y2 = x2 - y2;
        x2 = x2 - y2;
        //不需要第三方变量的，通过异或来做
        int x3 = 10;
        int y3 = 5;
        x3 = x3 ^ y3;
        y3 = x3 ^ y3;
        x3 = x3 ^ y3;

    }
}

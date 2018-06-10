package com.ldu.bevishe.day25;

public class Test_Opertor {


    public static void main(String[] args) {
        short s = 1;
        s += 1;     //s=(short)(s+1)底层中自动强制类型转换了
        System.out.println(s);
        short t = 1;
        //t = t + 1; //需要强制类型转换
        //System.out.println(t);
        int x = 4;
        int y = (x++)+(++x) + x*10;
        System.out.println("x="+x);
        System.out.println("x="+x+","+"y="+y);
        System.out.println(y);
    }
}

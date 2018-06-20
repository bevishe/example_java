package com.ldu.bevishe.day10;

import java.math.BigInteger;

public class Demo12_BigInteger {
    public static void main(String[] args) {
        //method1();
        //method2();

    }

    //BigInteger中的加减乘除和商加余数
    public static void method2() {
        BigInteger bi1 = new BigInteger("325232");                  //BigIntege对象是不可变的任意精度的整数，所以重新对其赋值之后原来的对象就变成了垃圾
        BigInteger bi2 = new BigInteger("23432");
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        BigInteger[] bigIntegers = bi1.divideAndRemainder(bi2);
        for (int i = 0; i < bigIntegers.length; i++) {
            System.out.print(bigIntegers[i]+"......");
        }
    }

    public static void method1() {
        BigInteger bi1 = new BigInteger("1234");
        BigInteger bi2 = new BigInteger("-234");
        BigInteger bi3 = new BigInteger("-23");
        System.out.println(bi1.and(bi1));
        System.out.println(bi2.and(bi2));
        System.out.println(bi1.and(bi2));
        System.out.println(bi3.and(bi2));
        /*使用BigInter中的and运算时，只用当两个数均为负数是，返回值才是一个负数
        * 自己and自己，返回的还是自己
        * 两个同的数and，返回值是两数想减的
        * */
    }
}

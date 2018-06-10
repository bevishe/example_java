package com.ldu.bevishe.day25;

public class Demo1_Operator1 {
    public static void main(String[] args) {
        // &,|,^,!
        //        int x = 10;
        //逻辑与&并且and
        int a = 10;
        int b = 20;
        int c = 30;
        //逻辑与
        System.out.println(a < b & b < c);
        System.out.println(a < b & b > c);
        System.out.println(a > b & b < c);
        System.out.println(a > b & b > c);
        System.out.println();

        //逻辑或
        System.out.println(a > b | b > c);
        System.out.println(a > b | b < c);
        System.out.println(a < b | b > c);
        System.out.println(a < b | b < c);
        System.out.println();

        //逻辑异或 两边逻辑一样则为false，两边不同则为true
        System.out.println(a > b ^ b > c);
        System.out.println(a > b ^ b < c);
        System.out.println(a < b ^ b > c);
        System.out.println(a < b ^ b < c);
        System.out.println();

        //逻辑非 ！
        System.out.println(!true);
        System.out.println();


    }
}

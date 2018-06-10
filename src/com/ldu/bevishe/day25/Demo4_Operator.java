package com.ldu.bevishe.day25;

public class Demo4_Operator {
    public static void main(String[] args) {
        //三元运算符
        int x = 10;
        int y = 5;
        int z;
        z = (x > y)? x: y;
        System.out.println(z);
        boolean b1 = ( x == y ) ? true : false;
        System.out.println(b1);
        //获取三个整数中的最大值
        int a = 10 ,b = 20 ,c = 30;
        //先比较任意两个数的值，找出较大值，然后和后面的比
        int temp;
        temp = (a > b )? a : b ;
        temp = (temp > c ) ? temp : c ;
        System.out.println("max = "+ temp);

    }
}

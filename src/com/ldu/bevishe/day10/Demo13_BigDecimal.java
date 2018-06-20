package com.ldu.bevishe.day10;

import java.math.BigDecimal;

public class Demo13_BigDecimal {
    public static void main(String[] args) {
        System.out.println(2.0-1.1);
        BigDecimal bd = new BigDecimal("32.2435324523452");

        BigDecimal bd1 = new BigDecimal("2.0");           //推荐开发时传入字符串
        BigDecimal bd2 = new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2));

        BigDecimal bd3 = new BigDecimal(2.0);           //这种在开发中也是不使用的，不推荐
        BigDecimal bd4 = new BigDecimal(1.1);
        System.out.println(bd3.subtract(bd4));

        BigDecimal bd5 = BigDecimal.valueOf(2.0);       //这种方式在开发中也是可以的
        BigDecimal bd6 = BigDecimal.valueOf(1.1);
        System.out.println(bd5.subtract(bd6));
    }
}

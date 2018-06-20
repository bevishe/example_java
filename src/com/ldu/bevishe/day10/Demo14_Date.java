package com.ldu.bevishe.day10;

import java.util.Date;

public class Demo14_Date {
    public static void main(String[] args) {
        //method1();
        Date date = new Date();
        date.setTime(1000);         //设置毫秒值,改变时间对象
        System.out.println(date);

    }

    public static void method1() {
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());                    //通过时间对象获取毫秒值
        System.out.println(System.currentTimeMillis());

        Date date2 = new Date(0);           //如果构造参数中传为零，代表1970,1,1日，系统在东八区所以是八点
        System.out.println(date2);         //通过毫秒值设置时间对象

        Date date3 = new Date(1);
        System.out.println(date3);
    }
}

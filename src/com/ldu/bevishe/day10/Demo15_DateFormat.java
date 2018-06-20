package com.ldu.bevishe.day10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo15_DateFormat {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();

    }

    public static void method4() {
        //将时间字符串转换为日期对象
        String str = "2018年08月08日08时08分08秒";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        try {
            Date date = sdf.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //自定义日期对象格式化同时转化为字符串
    public static void method3() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(simpleDateFormat.format(date));
    }

    public static void method2() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();//创建日期格式化类
        System.out.println(sdf.format(date));
    }

    public static void method1() {
        DateFormat df = DateFormat.getDateInstance();         //DateFormat是抽象类不允许实例
        //相当于父类引用指向子类对象，右边的方法返回子类对象
        /*  相当于
            DateFormat df = new SimpleDateFormat();
        * */
        System.out.println(df.format(new Date()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(2&3);    //&做的事按位与操作
    }
}

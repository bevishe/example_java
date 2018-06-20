package com.ldu.bevishe.day10;

import java.util.Calendar;

public class Demo16_Calendar {
    public static void main(String[] args) {
        //method1();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR,3);           //对给定的字段进行向前加或者向后减
        cal.add(Calendar.MONTH,3);
        cal.set(Calendar.YEAR,2053);            //修改指定字段
        System.out.println(cal.get(Calendar.YEAR) + "年" + returnNumber(cal.get(Calendar.MONTH) + 1) + "月" + returnNumber(cal.get(Calendar.DAY_OF_MONTH)) + "日");

    }

    public static void method1() {
        Calendar cal = Calendar.getInstance();          //父类引用指向子类对象
        System.out.println(cal);
        System.out.println(cal.get(Calendar.YEAR));    //YEAR是static final修饰的
        System.out.println(cal.get(Calendar.MONTH) + 1);//通过字段获取月
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));//月中的day
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //周日是第一天，周六是最后一天
        System.out.println(getWeek(cal.get(Calendar.DAY_OF_WEEK)));
        System.out.println(cal.get(Calendar.YEAR) + "年" + returnNumber(cal.get(Calendar.MONTH) + 1) + "月" + returnNumber(cal.get(Calendar.DAY_OF_MONTH)) + "日");
    }

    //将星期存储在表中进行查表
    public  static String getWeek(int week){
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[week];
    }

    //将一个的数字前面补零
    public static String returnNumber(int num){
        if(num >= 10)
            return "" + num;
        else
            return "0" + num;
    }
}

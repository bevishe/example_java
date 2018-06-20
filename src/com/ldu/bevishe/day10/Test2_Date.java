package com.ldu.bevishe.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2_Date {
    public static void main(String[] args) throws ParseException {
        String brithday = "1996年05月01日";
        String today = "2018年06月18日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date d1 = simpleDateFormat.parse(brithday);
        Date d2 = simpleDateFormat.parse(today);
        long time = d2.getTime() - d1.getTime();
        System.out.println(time/1000/60/60/24/365);
    }
}

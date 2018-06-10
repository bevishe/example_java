package com.ldu.bevishe.day27;
import java.util.Scanner;

public class Demo2 {
    public static char getWeek(int week){
        char[] arr = {' ','一','二','三','四','五','六','日'};
        return arr[week];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入对应的星期范围：");
        int week = sc.nextInt();
        System.out.println("星期 "+ getWeek(week));

    }

}


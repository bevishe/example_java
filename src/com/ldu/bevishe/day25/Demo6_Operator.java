package com.ldu.bevishe.day25;
import java.util.Scanner;

public class Demo6_Operator {
    public static void main(String[] args) {
        //switch语句
        System.out.println("输入你的成绩：");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        switch(grade){
            case 100:System.out.println("100分。"); break;
            default: System.out.println("你的输入有误。");
        }

    }
}

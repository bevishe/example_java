package com.ldu.bevishe.day8;

import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);
//        String name;
        if(sc.hasNextInt()){
            int i = sc.nextInt();
            System.out.println(i);
        }
        else
            System.out.println("输入不正确");
    }
}

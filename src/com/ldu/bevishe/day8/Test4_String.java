package com.ldu.bevishe.day8;

import java.util.Scanner;
//将输入的字符串逆返输出
public class Test4_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        String str = "";
        for(int i = 0 ;i < arr.length; i ++){
            str = str + arr[arr.length - i - 1];
        }
        System.out.println(str);
    }
}

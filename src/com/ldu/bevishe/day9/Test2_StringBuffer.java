package com.ldu.bevishe.day9;

import java.util.Scanner;
//使用StringBuffer将字符串反转
public class Test2_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String line = sc.nextLine();
        StringBuffer sb = new StringBuffer(line);//将字符串转换为字符串对象
        System.out.println(sb.reverse().toString());
    }
}

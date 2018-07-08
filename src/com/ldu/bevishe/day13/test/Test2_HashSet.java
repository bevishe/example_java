package com.ldu.bevishe.day13.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2_HashSet {
    public static void main(String[] args) {
        //使用Scanner从键盘读取一行输入，去掉其中的重复字符，打印出不同的那些字符
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] arr = line.toCharArray();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (Character ch : arr) {
            lhs.add(ch);
        }
        for (Character ch : lhs) {
            System.out.print(ch);
        }
    }
}

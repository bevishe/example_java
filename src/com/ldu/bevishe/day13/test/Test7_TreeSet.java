package com.ldu.bevishe.day13.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test7_TreeSet {
    public static void main(String[] args) {
        System.out.println("请输入整数：（输入quit结束接收）");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : -num;
            }
        });
        while(!"quit".equals(line)){
            Integer num = Integer.valueOf(line);
            ts.add(num);
            line = scanner.nextLine();
        }
        for (int num :ts) {
            System.out.print(num + " - ");
        }
    }
}

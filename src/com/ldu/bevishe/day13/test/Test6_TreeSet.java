package com.ldu.bevishe.day13.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6_TreeSet {
    public static void main(String[] args) {
        System.out.println("请输入你的字符串：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] ch = line.toCharArray();
        TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });
        for (Character c : ch) {
            ts.add(c);
        }
        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}

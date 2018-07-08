package com.ldu.bevishe.day13.test;

import com.ldu.bevishe.day13.bean.Student;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test8_TreeSet {
    public static void main(String[] args) {
        System.out.println("输入学生的姓名，语文，数学，英语成绩：（输入quit结束录入）");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        TreeSet<Student> ts = new TreeSet<>();
        while(!"quit".equals(line)){
            String[] arr = line.split(",");
            String name = arr[0];
            int chinese = Integer.valueOf(arr[1]);
            int math = Integer.valueOf(arr[2]);
            int english = Integer.valueOf(arr[3]);
            ts.add(new Student(name,chinese,math,english));
            line = scanner.nextLine();
        }

        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

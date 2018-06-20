package com.ldu.bevishe.day11.collection;

import com.ldu.bevishe.day11.bean.Student;

public class Demo1_Array {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student("张三丰",23); //创建一个学生对象存储在数组的第一个位置
        student[1] = new Student("黄飞鸿",21);
        student[2] = new Student("黄飞鸿",21);
        student[3] = new Student("黄飞鸿",21);
        student[4] = new Student("黄飞鸿",21);

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "--" + student[i].getAge());
        }

        System.out.println(student.length);

    }
}

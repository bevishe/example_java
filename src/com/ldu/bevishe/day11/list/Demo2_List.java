package com.ldu.bevishe.day11.list;

import com.ldu.bevishe.day11.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo2_List {
    public static void main(String[] args) {
        //向list集合中存储学生对象
        List list = new ArrayList();
        list.add(new Student("黄飞鸿"  ,23));
        list.add(new Student("郭靖",25));
        list.add(new Student("杨过",28));
        list.add(new Student("张三丰",28));

        //通过索引来获取集合的元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //list（）返回的是object对象，当我们想使用Student中的get，set方法时，我们需要向下强转
        for (int i = 0; i < list.size(); i++) {
            System.out.println(((Student)list.get(i)).getName());

        }

    }
}

package com.ldu.bevishe.day12.generic;

import com.ldu.bevishe.day12.bean.Person;
import com.ldu.bevishe.day12.bean.Worker;

import java.util.ArrayList;
import java.util.List;

public class Demo5_Generic {
    public static void main(String[] args) {
        //泛型通配符，可以接受任意类型的泛型
        List<?> list = new ArrayList<String>();
        ArrayList<Person> list1 = new ArrayList<Person>();
        list1.add(new Person("张三",23));
        list1.add(new Person("李四",24));

        ArrayList<Worker> list2 = new ArrayList<>();
        list2.add(new Worker("王五",25));
        list2.add(new Worker("赵六",26));

        list1.addAll(list2);
        System.out.println(list1);

    }
}

package com.ldu.bevishe.day12.jdk5;

import com.ldu.bevishe.day12.bean.Person;

import java.util.ArrayList;
//集合中嵌套集合以及遍历操作
public class Demo6_ArrayListInArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list= new ArrayList<>();
        
        ArrayList<Person> first = new ArrayList<>();
        first.add(new Person("张三丰",23));
        first.add(new Person("张四丰",24));
        first.add(new Person("张五丰",25));

        ArrayList<Person> second = new ArrayList<>();
        second.add(new Person("黄飞鸿",23));
        second.add(new Person("黄鸿",23));
        second.add(new Person("飞鸿",23));
        
        list.add(first);
        list.add(second);
        
        //嵌套集合的遍历
        for (ArrayList<Person> arrayList1 : list) {
            for (Person person : arrayList1) {
                System.out.println(person);
            }
        }
    }
}

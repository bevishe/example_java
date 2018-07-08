package com.ldu.bevishe.day13.set;

import com.ldu.bevishe.day13.bean.Person;

import java.util.HashSet;

public class Demo2_HashSet {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",23));
        hs.add(new Person("李四",24));
        hs.add(new Person("李四",24));
        System.out.println(hs);

    }
}

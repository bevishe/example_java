package com.ldu.bevishe.day13.test;

import com.ldu.bevishe.day13.bean.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class Test4_TreeSet {
    //按照姓名排序
    public static void main(String[] args) {
        //method1();
        //使用比较器进行TreeSet类的比较
        TreeSet<String> ts = new TreeSet<String>(new CompareByLen());
        ts.add("hello");
        ts.add("how");
        ts.add("are");
        ts.add("you");
        ts.add("!");
        System.out.println(ts);


    }

    public static void method1() {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三",23));
        ts.add(new Person("李四",23));
        ts.add(new Person("张飞",23));
        ts.add(new Person("关羽",23));
        ts.add(new Person("关羽在此",23));
        System.out.println(ts);
    }
}

class CompareByLen implements Comparator {
    //按照字符串的长度比较
    @Override
    public int compare(Object o1, Object o2) {
        int num = ((String)o1).length() - ((String)o2).length();
        return num == 0 ? ((String)o1).compareTo((String)o2) : num ;
    }
}

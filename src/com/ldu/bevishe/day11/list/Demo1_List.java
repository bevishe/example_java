package com.ldu.bevishe.day11.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        List list = new ArrayList();
        //set（）将制定位置的元素改变
    }

    public static void method4() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Object object1 = list.get(0);
        System.out.println(object1);
        //list中可以通过索引来遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //同时也可以使用迭代器来做集合的遍历
    }

    public static void method3() {
        List list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        //删除的时候不会自动装箱,直接填入111会将其当做索引
        list.remove((Integer)111);
        System.out.println(list);
    }

    public static void method2() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Object obj = list.remove(1);
        System.out.println(obj);
        System.out.println(list);
    }

    public static void method1() {
        List list = new ArrayList();        //看list中特有的方法
        //多态的弊端，不可以访问子类中特有的方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(1,"e");
        System.out.println(list);
        //当存储时使用不存在的索引是就会出现索引异常，index小与等于size并且大于等于零都可以，不会报异常
    }
}

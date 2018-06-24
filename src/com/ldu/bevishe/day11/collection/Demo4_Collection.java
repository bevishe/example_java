package com.ldu.bevishe.day11.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_Collection {
    public static void main(String[] args) {
        //method1();
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");

        c2.add("a");
        c2.add("d");

        System.out.println(c1.retainAll(c2)); // 看调用的集合取交集之后是否又改变，有改版则为True，否者就为false
    }

    public static void method1() {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");

        System.out.println(c1.containsAll(c2));

        //c1.add(c2);
        System.out.println(c1);//[a, b, c, d, [a, b, c, d]]  将c2当做一个对象添加到c1中来
        c1.addAll(c2);
        System.out.println(c1);//[a, b, c, d, a, b, c, d]
    }
}

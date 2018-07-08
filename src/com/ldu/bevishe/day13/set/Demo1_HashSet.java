package com.ldu.bevishe.day13.set;

import java.util.HashSet;

public class Demo1_HashSet {
    public static void main(String[] args) {
        //当向hashSet中存储相同元素时，会返回false
        //hashSet的继承体系中用重写toString方法，
        //set集合的特点
        /*1.无索引
          2.无序，存取不一致
        * */
        HashSet<String> hs = new HashSet<>();
        hs.add("c");
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(hs);
        hs.add("b");
        System.out.println(hs);
    }
}

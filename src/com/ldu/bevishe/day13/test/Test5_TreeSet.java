package com.ldu.bevishe.day13.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test5_TreeSet {
    public static void main(String[] args) {
        //定义一个方法让其有序，同时保留同样元素
        ArrayList<String> al = new ArrayList();
        al.add("hi");
        al.add("hi");
        al.add("hi");
        al.add("are");
        al.add("are");
        al.add("you");
        al.add("you");
        al.add("!");

        sort(al);

        for (String str : al) {
            System.out.println(str);
        }
    }

    public static void sort(ArrayList<String> arrayList) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });
        ts.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(ts);
    }
}

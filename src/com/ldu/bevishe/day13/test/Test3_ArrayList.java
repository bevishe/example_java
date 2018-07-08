package com.ldu.bevishe.day13.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test3_ArrayList {
    public static void main(String[] args) {
        //去掉集合中的重复元素
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("mary");
        arrayList.add("mary");
        arrayList.add("mary");
        arrayList.add("jack");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        singleArrayList(arrayList);
        System.out.println(arrayList);
    }

    public static void singleArrayList(ArrayList arrayList) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(lhs);
    }
}

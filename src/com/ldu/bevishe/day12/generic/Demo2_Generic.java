package com.ldu.bevishe.day12.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_Generic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

package com.ldu.bevishe.day11.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo5_ListIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        ListIterator lit = list.listIterator(list.size());
//        while(lit.hasNext()){
//            System.out.println(lit.next());
//        }
        System.out.println("****************************************");
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}

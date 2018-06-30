package com.ldu.bevishe.day11.list;

import java.util.LinkedList;

public class Demo7_LinkedList {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.add("a");
        llist.add("b");
        llist.add("c");
        llist.add("d");

        llist.addFirst("first");
        llist.addLast("last");
        llist.add(1,1);
        System.out.println(llist);
    }
}

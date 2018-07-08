package com.ldu.bevishe.day13.set;

import java.util.LinkedHashSet;

public class Demo3_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("hello");
        lhs.add("you");
        lhs.add("me");
        System.out.println(lhs);
    }
}

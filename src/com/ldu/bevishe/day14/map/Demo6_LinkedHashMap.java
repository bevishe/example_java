package com.ldu.bevishe.day14.map;

import java.util.LinkedHashMap;

public class Demo6_LinkedHashMap {
    public static void main(String[] args) {
        //底层是链表实现的，怎么存储就怎么取
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("alne",21);
        linkedHashMap.put("mary",321);
        linkedHashMap.put("jack",21);
        linkedHashMap.put("ladu",12);

        System.out.println(linkedHashMap);
    }
}

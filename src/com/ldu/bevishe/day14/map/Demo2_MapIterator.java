package com.ldu.bevishe.day14.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Map中没有iterator（）方法，要如何迭代
* */
public class Demo2_MapIterator {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("alen",12);
        map.put("mary",34);
        map.put("jack",32);
        map.put("pick",23);
        //method1(map);
        //method2(map);
    }

    //使用增强for循环对key集合进行遍历，从而获取到每个value值
    public static void method2(Map<String, Integer> map) {
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            System.out.println(map.get(str));
        }
    }

    //得到key的set集合，对key进行迭代器遍历，然后获取到每个key的值
    public static void method1(Map<String, Integer> map) {
        Set<String> set = map.keySet();
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(map.get(itr.next()));
        }
    }
}

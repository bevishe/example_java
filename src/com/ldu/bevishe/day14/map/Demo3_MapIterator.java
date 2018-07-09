package com.ldu.bevishe.day14.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3_MapIterator {
    public static void main(String[] args) {
        //根据键值对对象来获取map中的每个键值对
        //把双列集合的键值对变成单列集合的键值对对象
        Map<String,Integer> map = new HashMap<>();//父类引用指向子类对象，调用Map.Entry方法时，编译的时候开左边，运行的时候看右边，多态的弊端是不能使用子类中特有的方法属性，需要强转
        map.put("alen",12);
        map.put("mary",34);
        map.put("jack",32);
        map.put("pick",23);

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> itr = entrySet.iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry = itr.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        for (Map.Entry<String,Integer> en: entrySet){
            System.out.println(en);
        }

    }
}

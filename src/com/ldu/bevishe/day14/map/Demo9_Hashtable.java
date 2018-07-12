package com.ldu.bevishe.day14.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo9_Hashtable {
    public static void main(String[] args) {
        //HashMap和Hashtable的区别
        /*共性：都是hash算法实现，都是双列结合
          区别：
                    HashMap是线程不安全的，效率高 jdk2
                    Hashtable是线程安全的，效率低 jdk1

                    HashMap可以存储null和null值
                    Hashtable不可存储null和null值

        * */

        HashMap<String,Integer> hs = new HashMap<>();

        System.out.println(hs.put(null,32));
        System.out.println(hs.put(null,null));

        Hashtable<String,Integer> hashtable = new Hashtable<>();
        System.out.println(hashtable.put(null,32));
        System.out.println(hashtable.put("hi",null));

    }
}

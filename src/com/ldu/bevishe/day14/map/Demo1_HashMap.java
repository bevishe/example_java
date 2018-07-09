package com.ldu.bevishe.day14.map;

import java.util.Collection;
import java.util.HashMap;
//HashSet底层是用HashMap来完成的，因为
public class Demo1_HashMap {
    public static void main(String[] args) {
        //method1();
        //method2();
        HashMap<String,Integer> hm = new HashMap<>();
        Integer i = hm.put("张三",23);
        hm.put("李四",24);
        hm.put("王五",25);
        hm.put("赵六",26);
        Collection<Integer> collection = hm.values();
        System.out.println(collection);
        System.out.println(hm.size());
    }

    public static void method2() {
        HashMap<String,Integer> hm = new HashMap<>();
        Integer i = hm.put("张三",23);
        hm.put("李四",24);
        hm.put("王五",25);
        hm.put("赵六",26);

        hm.remove("李四");//返回键对应的值
        System.out.println(hm);//通过删除k来删除整个键值对，
        System.out.println(hm.containsKey("李四"));  //判断是否包含相应的键
        System.out.println(hm.containsValue(23));    //判断是否包含相应的值
        System.out.println(hm.isEmpty());
    }

    public static void method1() {
        HashMap<String,Integer> hm = new HashMap<>();
        Integer i = hm.put("张三",23);
        hm.put("李四",24);
        hm.put("王五",25);
        hm.put("赵六",26);
        Integer i2 = hm.put("张三",23);

        System.out.println(hm);
        System.out.println(i);  //返回的是null，返回的是被覆盖的
        System.out.println(i2); //返回的是23，返回的是被覆盖的值，hashMap中相同的键不存储，值存储
    }
}

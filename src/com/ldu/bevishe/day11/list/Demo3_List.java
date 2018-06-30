package com.ldu.bevishe.day11.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3_List {
    public static void main(String[] args) {
        //判断集合中有没有word元素，有的话就向集合中添加一个javee元素
        List list = new ArrayList();
        list.add("hello");
        list.add("you");
        list.add("me");
        list.add("word");
        //使用索引来对集合进行遍历
        //method1(list);
        //使用迭代器来对集合进行遍历
        //method2(list);
        //并发修改异常
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            if(((String)itr.next()).equals("word")){
//                list.add("javae");
//        }
//        System.out.println(list);
    }

    public static void method2(List list) {
        Iterator itr2 = list.iterator();
        while(itr2.hasNext()){
            if(((String)itr2.next()).equals("word")){
                list.add(list.size(),"javee");
                break;
            }
        }
        System.out.println(list);
    }

    public static void method1(List list) {
        for (int i = 0; i < list.size(); i++) {
            if(((String)list.get(i)).equals("word")){
                list.add(list.size(),"javee");
                break;
            }
        }
        System.out.println(list);
    }
}

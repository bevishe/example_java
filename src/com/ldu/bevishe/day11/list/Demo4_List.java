package com.ldu.bevishe.day11.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo4_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("word");
        list.add("d");

        /*
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            String str = (String)itr.next();
            if(str.equals("word"))
                list.add("javee");
        }
        System.out.println(list);
        //会出现并发修改异常ConcurrentModificationException
        */

        ListIterator lItr = list.listIterator();
        while(lItr.hasNext()){
            String str = (String)lItr.next();
            if(str.equals("word"))
                //list.add()同样会出现并发修改异常
                lItr.add("javee");
        }
        System.out.println(lItr.previous());
        System.out.println(list);
    }
}

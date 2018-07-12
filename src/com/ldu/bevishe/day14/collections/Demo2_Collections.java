package com.ldu.bevishe.day14.collections;

import com.ldu.bevishe.day14.bean.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Demo2_Collections {
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        list.add(new Worker("alen",2));
        list.add(new Worker("mary",23));
        list.add(new Worker("jack",23));
        list.add(new Worker("mark",32));
        Collections.sort(list);
        Collections.binarySearch(list,new Worker("alen",2));
        System.out.println(list);
        Iterator<Worker> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}

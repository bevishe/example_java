package com.ldu.bevishe.day13.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test1_HashSet {
    public static void main(String[] args) {
        //要求：获取10个1-20的不重复的随机数
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        while(count < 10){
            Integer randomNum = (int)(Math.random()*20 + 1);
            System.out.println(randomNum);
            if(hs.add(randomNum)){
                count++;
            }
            System.out.println("count = " + count);
        }
        System.out.println(hs);
        Iterator<Integer> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

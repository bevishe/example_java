package com.ldu.bevishe.day12.list;

import java.util.ArrayList;
import java.util.Iterator;
//对ArrayList中进行去重操作
public class Demo1_ArrayList {
    public static void main(String[] args) {
        ArrayList aL = new ArrayList();
        aL.add("a");
        aL.add("a");
        aL.add("a");
        aL.add("a");
        aL.add("b");
        aL.add("b");
        aL.add("b");
        aL.add("b");
        aL.add("c");
        aL.add("c");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = aL.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            if(!arrayList2.contains(str))
                arrayList2.add(str);
        }
        System.out.println(arrayList2);
    }
}

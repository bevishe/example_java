package com.ldu.bevishe.day12.list;

import com.ldu.bevishe.day12.bean.Student;

import java.util.LinkedList;
/*LinkedList类集合中特有的方法
addFirst（），addLast(）
removeFirst(),removeLast()
get(int index)
* */
public class Demo3_LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Student("Mary",12));
        linkedList.add(new Student("alen",23));
        linkedList.addFirst(new Student("first",12));
        linkedList.addLast(new Student("last",54));
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
    }
}

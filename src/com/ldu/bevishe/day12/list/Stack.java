package com.ldu.bevishe.day12.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Stack {
    private LinkedList list = new LinkedList();

    public void in (Object object){
        list.addLast(object);
    }

    public Object out (){
        return list.removeLast();
    }

    public boolean isEmpty() {
         boolean flag = true;
         if(list.size() != 0)
             flag = false;
         return flag;
    }

    public void print() {
        ListIterator itr = list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}

class Demo_Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.in(34);
        stack.in(34);
        stack.in(34);
        stack.in("fdsa");
        stack.in("last");
        System.out.println(stack.out());
        stack.print();
        System.out.println(stack.isEmpty());
    }
}

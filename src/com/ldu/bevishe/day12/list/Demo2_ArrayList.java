package com.ldu.bevishe.day12.list;

import com.ldu.bevishe.day12.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student("张三丰",23));
        arrayList.add(new Student("张三丰",23));
        arrayList.add(new Student("张三丰",23));
        arrayList.add(new Student("Alen",32));
        arrayList.add(new Student("Alen",32));
        arrayList.add(new Student("Alen",32));
        arrayList = getSingle(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = (Student)arrayList.get(i);
            System.out.println(student.getName()+"*********"+student.getAge());
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(new Student("张三丰",23));
    }

    public static ArrayList getSingle(ArrayList arrayList){
        ArrayList al = new ArrayList();
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            if(!al.contains(obj))               //contains()方法中调用的是equals方法，子类没用重写的话就会使用Object类中的equals方法
                al.add(obj);
        }
        return al;
    }
}

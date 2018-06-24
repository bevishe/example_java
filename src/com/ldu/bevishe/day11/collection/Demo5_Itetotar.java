package com.ldu.bevishe.day11.collection;

import com.ldu.bevishe.day11.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo5_Itetotar {
    public static void main(String[] args) {
        //method1();
        //method2();
    }

    //自定义对象中的迭代，当使用子类中的方法和属性时需要向下转型
    public static void method2() {
        Collection c = new ArrayList();
        c.add(new Student("zhangSan",12));
        c.add(new Student("wangSan",12));
        c.add(new Student("liSan",12));
        Iterator it = c.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());
            Student s = (Student)it.next();
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }
    }

    public static void method1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Iterator it = c.iterator();
//        boolean b1 = it.hasNext();  //判断迭代器中是否有元素
//        Object obj1 = it.next();    //next方法会将指针后移
//        System.out.println(obj1);

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

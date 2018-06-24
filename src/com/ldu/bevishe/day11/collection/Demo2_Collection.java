package com.ldu.bevishe.day11.collection;

import com.ldu.bevishe.day11.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
//集合中可以添加任何对象
@SuppressWarnings({"rawtypes","unchecked"})
public class Demo2_Collection {

    public static void main(String[] args) {
        //method1();
        Collection c = new ArrayList();
        c.add("3");
        c.add("343");
        c.add("dsf");
        System.out.println(c.contains("343"));      //判断集合是否包含相应的元素
        c.remove("3");
        System.out.println("集合中元素的个数："+ c.size());
        System.out.println(c);
        c.clear();
        System.out.println(c);
    }

    public static void method1() {
        //如果是list集合，add（）一直返回true，因为list集合是可以存储重复元素，如果是set集合，当添加重复元素是会返回false
        Collection c = new ArrayList();
        boolean b1 = c.add("hello");
        boolean b2 = c.add(12);         //自动装箱
        boolean b3 = c.add(true);
        boolean b4 = c.add(new Student("张三丰",23));
        boolean b5 = c.add(12);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        System.out.println(c);
    }
}

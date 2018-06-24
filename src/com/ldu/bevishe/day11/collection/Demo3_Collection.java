package com.ldu.bevishe.day11.collection;

import com.ldu.bevishe.day11.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

//结合转化为数组对其进行遍历
public class Demo3_Collection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(23);
        c.add("dfs");
        c.add("jfdk");
        c.add(new Student("wangWu",23));            //其实相当于父类引用指向子类对象 Object o = new Student（"wangWu",23）；
        Object[] obj = c.toArray(); // 将集合转换为数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println(((Student)obj[3]).getName());            //多态的弊端，不可以使用子类中特有的行为和属性，必须对其进行向下转型
        System.out.println(((Student)obj[3]).getAge());
        ((Student)obj[3]).setName("newName");
        System.out.println(((Student)obj[3]).getName());
    }
}

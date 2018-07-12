package com.ldu.bevishe.day14.collections;

import com.ldu.bevishe.day14.bean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//集合工具类中的一些方法的使用
public class Demo1_Collections {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("赵六",26));
        Collections.sort(list);
        System.out.println(list);
        Student s = new Student("李四",24);
        int n = Collections.binarySearch(list, s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });
        System.out.println(n);
        Student student = Collections.max(list);
        System.out.println(student);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}

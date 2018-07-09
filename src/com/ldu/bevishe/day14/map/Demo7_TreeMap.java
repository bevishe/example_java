package com.ldu.bevishe.day14.map;

import com.ldu.bevishe.day14.bean.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo7_TreeMap {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });

        treeMap.put(new Student("张三",23),"湖北");
        treeMap.put(new Student("李四",24),"安徽");
        treeMap.put(new Student("王五",25),"山东");
        treeMap.put(new Student("赵六",26),"重庆");
        treeMap.put(new Student("赵六",26),"重庆");

        System.out.println(treeMap);

        Set<Map.Entry<Student,String>> entry = treeMap.entrySet();
        for (Map.Entry<Student,String> en: entry) {
            System.out.println(en);
        }
    }
}

package com.ldu.bevishe.day14.map;

import com.ldu.bevishe.day14.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo5_HashMap {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("张三",23),"一年级");
        map.put(new Student("李四",24),"二年级");
        map.put(new Student("王五",25),"三年级");
        map.put(new Student("赵六",26),"四年级");
        map.put(new Student("刘七",27),"五年级");

        Set<Map.Entry<Student,String>> entry = map.entrySet();
        for (Map.Entry<Student, String> en : entry) {
            System.out.println(en.getKey() + " { " + en.getValue()  + " }");
        }
    }
}

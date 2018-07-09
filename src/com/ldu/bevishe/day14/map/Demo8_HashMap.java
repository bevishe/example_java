package com.ldu.bevishe.day14.map;

import com.ldu.bevishe.day14.bean.Student;

import java.util.HashMap;
import java.util.Set;

public class Demo8_HashMap {
    //hashMap中嵌套HashMap
    public static void main(String[] args) {
        HashMap<Student,String> class88 = new HashMap<>();
        class88.put(new Student("jack",12),"山东");
        class88.put(new Student("alen",21),"湖北");

        HashMap<Student,String> class89 = new HashMap<>();
        class89.put(new Student("mary",23),"烟台");
        class89.put(new Student("mark",31),"重庆");

        HashMap<HashMap<Student,String>,String> hashMap = new HashMap<>();
        hashMap.put(class88,"第88期课堂");
        hashMap.put(class89,"第89期课堂");

        Set<HashMap<Student,String>> set = hashMap.keySet();
        for (HashMap<Student, String> en : set) {
            System.out.println(en);
        }

        System.out.println("*******************");
        for (HashMap<Student, String> h : hashMap.keySet()) {
            String value = hashMap.get(h);
            for(Student key : h.keySet()){
                String value2 = h.get(key);
                System.out.println(key + " = " + value2 + " = " + value);
            }
        }

    }
}

package com.ldu.bevishe.day14.collections;

import com.ldu.bevishe.day14.bean.Student;
import com.ldu.bevishe.day14.bean.StudentSon;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3_Genric {
    public static void main(String[] args) {
        //泛型固定下边界
        /*泛型固定上边界
            ？ extends E
            ArrayList<Person> a = new ArrayList<>();
            a.addAll();
            向集合a中添加某个集合的元素时可以添加Person对象的也可以是Person对象的子类
        * */
        TreeSet<Student> treeSet = new TreeSet<>(new CompareByAge());
        treeSet.add(new Student("anle",23));
        treeSet.add(new Student("jack",24));
        treeSet.add(new Student("mary",12));
        System.out.println(treeSet);

        TreeSet<StudentSon> treeSetSon = new TreeSet<>(new CompareByAge());
        treeSet.add(new StudentSon("may",10));
        treeSet.add(new StudentSon("marks",9));

        System.out.println(treeSet);

    }
}

class CompareByAge implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getAge() - o2.getAge();
        return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
    }
}

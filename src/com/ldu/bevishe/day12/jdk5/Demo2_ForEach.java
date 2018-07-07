package com.ldu.bevishe.day12.jdk5;

import com.ldu.bevishe.day12.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo2_ForEach {
    public static void main(String[] args) {
        //method1();
        //查看三种集合能否删除
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Mary",12));
        arrayList.add(new Student("alen",14));
        arrayList.add(new Student("mark",12));
        //method1(arrayList);
        //method2(arrayList);
        //使用增强for循环来删除集合中的元素
        for (Student student : arrayList) {
            arrayList.remove(student);
        }
        System.out.println(arrayList);
        /*使用增强for循环来删除集合中的元素会报错:出现并发修改异常
        * 因为增强for循环底层是通过迭代器来实现的，同时在迭代器中使用集合自带的remove方法会产生并发修改异常
        * 所以在增强for循环之中没有迭代器，就是用不了迭代器的remove方法，自然就会出现并发修改异常
        * 所以使用增强for循环不能删除集合中的元素，只可以遍历
        * */
    }

    public static void method2(ArrayList<Student> arrayList) {
        //迭代器中的删除
//        ListIterator<Student> itr = arrayList.listIterator();
//        while(itr.hasNext()){
//            Student student = itr.next();
//            itr.remove();
//        }
//        System.out.println(arrayList);

        //第二种写法
        for (Iterator<Student> itr = arrayList.iterator(); itr.hasNext() ;){
            itr.remove();
        }
    }

    public static void method1(ArrayList<Student> arrayList) {
        //普通for循环,ArrayList的底层结构是数组，所以当删除一个元素时，后面的元素会向前面移动，同时size减一，若果
        //删除的元素紧挨着后面的就会被跳过，因为i会继续加加，但是元素被向前移动了，解决方法可以当执行删除操作后减减
        for (int i = 0 ;i < arrayList.size();i ++){
            arrayList.remove(i--);//在调用remove（）方法值之后，arrayList的长度
            System.out.println(arrayList.size());
        }
        System.out.println(arrayList);
    }

    public static void method1() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("alen",12));
        list.add(new Student("mary",34));
        //增强for循环底层依赖的是迭代器
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

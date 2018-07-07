package com.ldu.bevishe.day12.generic;
/*泛型generic的好处：
    将运行期内的错误在编译期显示出来，提高代码的安全性
    省去了强转，泛型必须是引用数据类型，且前后泛型必须一致
    jdk1.7的新特性 ，菱形泛型 ArrayList<Student> list = new ArrayList<>();
* */
import com.ldu.bevishe.day12.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_Generic {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
//        list.add("hel");
        list.add(new Student("黄飞鸿",19));
        list.add(new Student("黄飞鸿",19));
        list.add(new Student("黄飞鸿",19));
        list.add(new Student("黄飞鸿",19));

        System.out.println(list);

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getName()+itr.next().getAge());
        }//注意使用了两次next（）所以结果少了两个
        //next（）方法在迭代中只能调用一次，若果调用多次会将指针向后移动多次
    }
}

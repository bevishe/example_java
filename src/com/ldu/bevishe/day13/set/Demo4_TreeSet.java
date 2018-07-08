package com.ldu.bevishe.day13.set;

import com.ldu.bevishe.day13.bean.Person;

import java.util.TreeSet;

/*treeSet集合是用来对元素进行排序的，同样他也可以用来保证元素的唯一
* 当compareTo方法返回0时，treeSet只有一个元素
* 返回正数，怎么存，怎么取
* 返回负数，和存添加的顺序相反的存取
* */
public class Demo4_TreeSet {
    public static void main(String[] args) {
        //method();
        TreeSet<Person> ts = new TreeSet<>();

        ts.add(new Person("hi",23));
        ts.add(new Person("hi",23));
        ts.add(new Person("mary",23));
        ts.add(new Person("mary",24));
        ts.add(new Person("mary",24));
        ts.add(new Person("alen",25));
        ts.add(new Person("alen",25));
        ts.add(new Person("alen",25));
        System.out.println(ts);

    }

    public static void method() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(1);
        ts.add(1);
        ts.add(1);
        ts.add(3);
        ts.add(3);
        ts.add(3);
        ts.add(3);
        System.out.println(ts);
    }
}

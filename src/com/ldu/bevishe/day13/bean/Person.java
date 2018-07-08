package com.ldu.bevishe.day13.bean;

import java.util.Objects;

public class Person implements Comparable{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "- -" + age;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Person person = (Person)obj;
//        return (name.equals(person.name))&&(age == person.age);
//    }
//
//    //在使用HashSet集合之中，只有当返回的hash值相同时才会对元素作比较
//    /*如何降低调用equals（）方法的次数
//    * */
//    @Override
//    public int hashCode() {
//        return name.hashCode() + age ;
//    }

    //实现Compareable中的方法
    //TreeSet实现排序及单一元素就是通过compareTo的返回值来构建二叉树
//    @Override
//    public int compareTo(Object o) {
//        Person p = (Person)o;
//        int num = this.age - p.age;
//        return num == 0 ? this.name.compareTo(p.name) : num ; //num == 0为真的时候返回冒号前面的，当num == 0为假时返回的是冒号后面的表达式
//    }

    /*按照姓名排序
    public int compareTo(Object o){
        Person p = (Person)o;
        int num = thia.name.compareTo(p.name);
        return num == 0 ? this.age-p.age : num;
    }
       * */
    public int compareTo(Object o){
        Person p = (Person)o;
        int num = this.name.length() - p.name.length();
        if(num != 0)
            return num;
        else{
            num = this.name.compareTo(p.name);
            return num == 0 ? this.age - p.age : num;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}

package com.ldu.bevishe.day7;

public class Test1_NoName {
    public static void main(String[] args) {
        //用有名字的类
        PersonDemo pd = new PersonDemo();
        pd.method(new Student());
        //使用匿名内部类来做
        pd.method(new Person(){
            public void show(){
                System.out.println("匿名内部类当做参数传递，本质把匿名内部类看做一个对象");
            }
        });
    }
}

abstract class Person {
    public abstract void show();
}

class Student extends Person {
    public void show(){
        System.out.println("Student1 show");
    }
}

class PersonDemo {
    public void method(Person person){
        person.show();
    }
}
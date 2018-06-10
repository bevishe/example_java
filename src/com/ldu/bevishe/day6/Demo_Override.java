package com.ldu.bevishe.day6;
//在方法重写中，重写的方法的返回值可以是不同的，但是必须保证这两个返回值具有子父类的关系，否则返回值必须相同
public class Demo_Override {
    public static void main(String[] args) {

    }
}

class Person {
    public void print(){
        System.out.println("person");
    }
}

class Student extends Person {
    public void print(){
        System.out.println("Student1");
    }
}

class Father {
    public Person method () {
        return new Person();
    }
}

class Son extends Father{
    public Student method() {
        return new Student();
    }
}
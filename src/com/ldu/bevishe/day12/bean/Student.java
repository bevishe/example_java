package com.ldu.bevishe.day12.bean;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
    public boolean equals(Object obj) {
        Student stu = (Student)obj;
        if(stu.name.equals(name) && (stu.age == age))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "name:" + name + "----" + "age:" + age;
    }
}

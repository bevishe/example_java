package com.ldu.bevishe.day6;

public class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
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
        return "我的姓名是" + this.name +"，我的年龄是" +this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Student1 s = (Student1)obj;
        return (this.name.equals(s.name))&&(this.age==s.age);
    }
}

package com.ldu.bevishe.day30;

public class Demo_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("李四");
        s.setAge(24);
        System.out.println("我的姓名是"+s.getName()+",我的年龄是"+s.getAge());

    }

}

class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("这是默认构造放方法。");
    }

    public Student(String name,int age ){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

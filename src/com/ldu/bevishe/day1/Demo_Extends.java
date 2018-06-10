package com.ldu.bevishe.day1;

public class Demo_Extends {
    public static void main(String[] args) {
        Son s = new Son("张三",18);
        s.print();
        System.out.println("姓名是 "+s.getName()+"年龄是 "+s.getAge());
        System.out.println("***********************");
        Son s2 = new Son();
        System.out.println("姓名是 "+s2.getName()+"年龄是 "+s2.getAge());
    }
}

class Father {
    private String name;
    private int age;

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

    int num1 = 10;

    public Father() {
        this("王五",20);
        System.out.println("父类的构造方法。");
    }

    public Father(String name,int age){
        this.name = name;
        this.age = age;

    }


}

class Son extends Father{
    int num1 = 20;

    public Son() {
        super();    //访问父类中的空参构造
        System.out.println("子类的构造方法。");
    }

    public Son(String name,int age){
        super(name,age);
        System.out.println("子类中的有参构造。");
    }


    public void print(){
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num1);

    }
}

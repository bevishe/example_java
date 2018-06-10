package com.ldu.bevishe.day3;

public class Demo_SuperMan {
    public static void main(String[] args) {
        Person p = new SuperMan();      //父类引用指向子类对象，超人提升为了人
        System.out.println("my name is "+p.name);
        p.work();
        ((SuperMan)p).fly();


    }
}

class Person {
    String name  = "John";
    public void work(){
        System.out.println("谈生意");
    }
}

class SuperMan extends Person {
    String name = "SuperMan";

    public void work(){
        System.out.println("谈大生意");
    }

    public void fly(){
        System.out.println("飞出去救人");
    }
}

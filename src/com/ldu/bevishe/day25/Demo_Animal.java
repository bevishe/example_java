package com.ldu.bevishe.day25;

public class Demo_Animal {
    public static void main(String[] args) {
        Cat c = new Cat("加菲",15);
        System.out.println(c.getName()+"****"+c.getAge());
        Dog d = new Dog("八公",30);
        System.out.println(d.getName()+"****"+d.getAge());
    }
}

abstract class Animal {
    private String name;
    private int age;

    public Animal() {

    }

    public Animal(String name, int age) {
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

    public abstract void eat();//吃饭方法
}

class Cat extends Animal {
    public Cat(){

    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}





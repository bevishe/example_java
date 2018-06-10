package com.ldu.bevishe.day5;

public class Demo_Animal {
    public static void main(String[] args) {
        Cat c = new Cat("加菲",14);
        c.eat();
        c.sleep();
        JumpCat j = new JumpCat("表演猫",3);
        j.jump();
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

    public abstract void eat();

    public abstract void sleep();
}

interface Jumping {
    public void jump();
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void sleep(){
        System.out.println("侧着睡");
    }
}

class JumpCat extends Cat implements Jumping {
    public JumpCat() {
    }

    public JumpCat(String name, int age) {
        super(name, age);
    }

    public void jump(){
        System.out.println("训练猫跳");
    }
}



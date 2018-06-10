package com.ldu.bevishe.day2;

public class Demo_Animal {
    public static void main(String[] args) {
        Cat c = new Cat("red",4);
        c.eat();
        c.catchMouse();
        Dog d = new Dog("yellow",4);
        d.eat();
        d.work();
    }
}

class Animal{
    private String color;
    private int count;

    public Animal(){

    }

    public Animal(String color,int count){
        this.color = color;
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}

class Cat extends Animal{
    public Cat(){

    }

    public Cat(String color,int count){
        super(color,count);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠。");
    }
}

class Dog extends Animal {
    public Dog(){

    }

    public Dog(String color,int count){
        super(color,count);
    }

    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void work(){
        System.out.println("狗的工作是看家。");
    }
}


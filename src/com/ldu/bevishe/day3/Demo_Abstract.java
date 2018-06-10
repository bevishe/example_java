package com.ldu.bevishe.day3;

public class Demo_Abstract {
    public static void main(String[] args) {
//        MyAnimal a = new MyAnimal();  抽象类是不允许被实例化的，
        MyAnimal a = new MyCats();
        a.eat();
    }
}

abstract class MyAnimal {

    public abstract void eat();

    public abstract void sleep();
}

class MyCats extends MyAnimal {
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void sleep(){
        System.out.println("猫去睡觉");
    }
}


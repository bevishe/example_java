package com.ldu.bevishe.day3;
//演示多态提高代码的扩展性
public class Demo_Animal {
    public static void main(String[] args) {
        Animals a1 = new MyCat();
        a1.eat();                   //当eat是MyCat中特有的时候，这样写是访问不到的，需要进行向下转型
        method(new MyCat());
        method(new MyDog());

    }

    public static void method(Animals a){
        a.eat();
    }

/*
    public static void method(Dog dog){
        dog.eat();
    }

    public static void method(MyCat c){
        c.eat();
    }*/
}

class Animals {
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class MyCat extends Animals{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }

}

class MyDog extends Animals{
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}

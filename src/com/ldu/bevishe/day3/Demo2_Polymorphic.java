package com.ldu.bevishe.day3;

public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.num);
        f.print();
        f.method();
    }
}

class Father {
    int num = 10;

    public void print(){
        System.out.println("Father print");
    }

    public static void method(){
        System.out.println("父类中的静态方法");
    }
}

class Son extends Father {
    int num = 20;

    public void print(){
        System.out.println("Son print");
    }

    public static void method(){
        System.out.println("子类中的静态方法");
    }
}
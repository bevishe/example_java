package com.ldu.bevishe.day6;

public class Demo {
    public static void main(String[] args) {
        Father2 f = new Son2();
        System.out.println(((Son2) f).num);      //对f进行了向下转型，所以可以看见子类中的num
        System.out.println(f.num);              //f是father2类型的，所以只可以访问到父类中的num
    }
}

class Father2 {
    int num = 10;
}

class Son2 extends Father2 {
    int num = 2;
}
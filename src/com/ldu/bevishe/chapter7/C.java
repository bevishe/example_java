package com.ldu.bevishe.chapter7;
//有继承会先调用父类中的构造函数，然后在自身类中函数对象的初试化
public class C extends A {

    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}


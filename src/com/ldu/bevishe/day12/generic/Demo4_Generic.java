package com.ldu.bevishe.day12.generic;

public class Demo4_Generic {
    public static void main(String[] args) {

    }
}

interface Inter<E> {
    public void show(E e);
}

//开发中使用的一般都是这类，因为实现接口的时候已经就是实现具体功能的类了
class Outer1 implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

class Outer2<E> implements Inter<E> {
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
package com.ldu.bevishe.chapter7;
//继承中的构造函数是从父类向外扩展的
public class Cartoon extends Drawing{

    Cartoon() {
        System.out.println("this is Cartoon constructor.");
    }

    public static void main(String[] args) {
        Cartoon s = new Cartoon();
        s.hello();
    }

}

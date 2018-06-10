package com.ldu.bevishe.day3;

public class Demo_Book {
    public static void main(String[] args) {

    }
}

abstract class Book {
    public abstract void read();
}

class Person1 extends Book{
    public void read(){
        System.out.println("在手机上看");
    }
}

class Person2 extends Book{
    public void read(){
        System.out.println("在纸上看");
    }
}

class Person3 extends Book{
    public void read(){
        System.out.println("在电视上看");
    }
}


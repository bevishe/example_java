package com.ldu.bevishe.day2;

public class Demo_FinalTest {
    public static void main(String[] args) {
        final int NUM = 10;
//        NUM = 20;
        System.out.println(NUM);

        final People p = new People();
        //p = new People("lisi",14);
        p.setName("lisi");
        p.setAge(14);

        method(10);
        method(20);
    }

    public static void method(final int x){
        System.out.println(x);
    }
}

class People {
    private String name;
    private int age;

    public People(){

    }

    public People(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setAge(int age){
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}


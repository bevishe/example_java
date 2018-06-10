package com.ldu.bevishe.day27;

public class Demo_Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-1);
        p.name = "hi";
        System.out.println(p.name+" is "+ p.getAge());

    }

}


class Person {
    String name;
    private int age;

    public void setAge(int a){
        if(a > 0 & a < 200){
            age = a;
        }
        else{
            System.out.println("please enter right age.");
        }
    }

    public int getAge(){
        return age;
    }
}
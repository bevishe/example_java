package com.ldu.bevishe.day30;

public class Demo_Person {


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "li";
        p1.country = "riben";
        Person p2 = new Person();
        p2.name = "zhang1";
        p1.speak();
        p2.speak();

    }


}
//静态成员变量在内存中是存储在方法区中的，在类字节码文件中的静态区，也叫共享区
class Person{
    String name;
    public static String country;

    public void speak() {
        System.out.println(name + "--"+ country);
    }
}

package com.ldu.bevishe.day1;

public class Cat extends Animal{

}

class Test{
/*extends 是继承的意思，cat和dog都是子类
* */
    public static void main(String[] args) {
        Cat c = new Cat();
        c.color = "red";
        c.sleep();
    }
}

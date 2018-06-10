package com.ldu.bevishe.day27;

public class Car {
    String color;
    int num;

    public void run(){
        System.out.println(color + "..."+ num);
    }

}

class Car_test{
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "red";
        c.num = 8;
        c.run();
    }
}
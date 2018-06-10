package com.ldu.bevishe.day27;

public class Demo_Car {
    public static void main(String[] args) {
        MyCar c1 = new MyCar();
        method(c1);
        c1.run();

        method(new MyCar());
    }

    public static void method(MyCar c){
        c.color = "red";
        c.num = 8;
    }
}

class MyCar {
    String color;
    int num;

    public void run(){
        System.out.println(color + " ----" + num);
    }
}

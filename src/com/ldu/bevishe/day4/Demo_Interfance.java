package com.ldu.bevishe.day4;

public class Demo_Interfance {
    public static void main(String[] args) {
        Inter i = new Demo();
        i.print();
        System.out.println(Inter.num);
        System.out.println(Demo.num);
        i.myPrint();
    }
}

//接口中的方法都是抽象的
//接口中不能定义非抽象方法
interface Inter {
    int num = 10;
    public abstract void print();

    //接口中是没有构造方法的

    void myPrint();
}

class Demo extends Object implements Inter {

    public Demo(){
        super();    //访问的Object
        System.out.println("Demo constructor");
    }


    public void print (){
        System.out.println("demo print"+this.num);
    }

    public void myPrint(){
        System.out.println("Myprint");
    }

}

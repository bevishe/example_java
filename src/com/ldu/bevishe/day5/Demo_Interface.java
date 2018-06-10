package com.ldu.bevishe.day5;

public class Demo_Interface {

}

interface InterA {
    public abstract void  printA();
}

interface InterB {
    public abstract void printB();
}

//接口与接口之间可以实现多继承
interface InterC extends InterA {
    public abstract void printC();
}

//两个接口中可以用相同的方法名，因为他们都没有方法体
class Demo implements InterA, InterB {  //一个类实现多个接口
    public void printA (){
        System.out.println("A");
    }

    public void printB(){
        System.out.println("B");
    }
}

class DemoC implements InterC{
    public void printC(){

    }

    public void printA (){

    }
}
package com.ldu.bevishe.chapter5;
import static com.ldu.bevishe.util.Print.*;

public class Mugs {
    Mug mug1;
    Mug mug2;
    {                                               //构造代码块在每次对象构建时都会执行，类似类的构造函数
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        println("mug1 &  mug2 initialized!");
    }
    Mugs(){
        println("Mugs()");
    }
    Mugs(int i) {
        println("Mugs(int)");
    }

    public static void main(String[] args) {
        println("inside main");
        new Mugs();
        println("new Mugs()");
        new Mugs(1);
        println("new Mugs(1)");
    }
}

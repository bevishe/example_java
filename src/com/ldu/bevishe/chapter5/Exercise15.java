package com.ldu.bevishe.chapter5;
import static com.ldu.bevishe.util.Print.*;
//实例初始化方式初始化含有代码块的类

public class Exercise15 {
    public String name;
    {
        name = "这是普通代码块";
        System.out.println(name);
    }

    static {

        System.out.println("这是静态代码块");
    }

    Exercise15(){
        name = "这是构造构造代码块";
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Exercise15();
        new Exercise15();
        new Exercise15();
    }
}

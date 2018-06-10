package com.ldu.bevishe.day2;

public class Demo1_Final {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
    }
}
/*final 修饰的成员变量初始化
            显示初始化
            在构造方法中初始化
* */
class Demo {
    final int num ;         //成员变量的默认初始化值是无效值

    public Demo(){
        num = 10;
    }

    public void print(){
        System.out.println(num);
    }
}

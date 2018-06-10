package com.ldu.bevishe.day7;

public class Demo4_InnerClass {
    public static void main(String[] args) {
        Outer4 i = new Outer4();
        i.method();
    }
}

//局部内部类类似局部变量，局部变量是存在类的方法之中，局部内部类也是如此的，//
//存在的地方是在方法中，同时也只在该方法中有效
/*
局部内部类只能在其所在的方法中才可以访问
* */
class Outer4 {
    public void method (){
        class Inner {
            public void print(){
                System.out.println("外部类中的方法中的内部类中的print方法");
            }
        }

        Inner i = new Inner();
        i.print();
    }


}

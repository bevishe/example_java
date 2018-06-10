package com.ldu.bevishe.day7;
//匿名内部类是局部内部类的一种，存在于方法之中，匿名内部类需要实现接口或者继承父类
//匿名的内部类只针对重写一个方法时使用
public class Demo_NoNameClass {
    public static void main(String[] args) {
        Outer5 o = new Outer5();
        o.method();
    }

}

interface Inter5{
    public void print();

    public void print2();

}

class Father {
    public void talk(){
        System.out.println("father is talking.");
    }
}

class Outer5 {
    class Inner implements Inter5 {
        public void print(){
            System.out.println("print");
        }

        public void print2(){

        }
    }

    public void method(){
//        Inner i = new Inner();
//        i.print();

        new Inter5() {              //  实现了Inter5接口
           public void print(){
               System.out.println("匿名内部类重写的print方法");
           }

           public void print2(){
               System.out.println("匿名内部类重写的Print2方法");
           }
        }.print();

        new Father(){

        }.talk();
    }

}
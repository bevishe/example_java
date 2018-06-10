package com.ldu.bevishe.day7;

public class Demo6_NoNameClass {
    public static void main(String[] args) {
        Outer6 o = new Outer6();
        o.method();
    }
}

interface Inner6 {
    public void print();
}
//匿名内部类的第二种调用方式,父类引用指向子类对象
//这么写有弊端:父类引用指向子类对象，不可以调用子类中特有的方法，因为匿名内部类没有类名，不可以向下转型
class Outer6 {
    public void method (){
        Inner6 i = new Inner6(){
          public void print(){
              System.out.println("匿名内部类中重写的print方法");
          }

          public void self(){
              System.out.println("匿名内部类中特有的方法");
          }
        };
        i.print();

    }
}
package com.ldu.bevishe.day7;

public class Test_NoName {
    public static void main(String[] args) {
       Outer7.method().show();              //要求：以这种形式输出
        /*说明调用method之后返回的是一个对象
        * */

        //父类引用指向子类对象
        Inter i = Outer7.method();
        i.show();
        }
}

interface Inter {
    void show();
}
 class Outer7 {
    public static Inter method(){
        return new Inter(){
          public void show(){
              System.out.println("匿名内部类中重写的show方法");
          }
        };
    }
 }


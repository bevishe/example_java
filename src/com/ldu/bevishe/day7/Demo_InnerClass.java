package com.ldu.bevishe.day7;

public class Demo_InnerClass {
    public static void main(String[] args) {//创建内部类对象
        Outer.Inner i = new Outer().new Inner();
        i.method();
    }

}

class Outer {
    private int num = 10;
    class Inner {
        public void method(){
            System.out.println("内部类"+num);
        }
    }

}
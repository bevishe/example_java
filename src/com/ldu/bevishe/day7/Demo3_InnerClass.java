package com.ldu.bevishe.day7;

public class Demo3_InnerClass {
    public static void main(String[] args) {
        OuterClass1.InnerClass1 o =  new OuterClass1.InnerClass1();
        o.method();
        OuterClass1.Inner1.method1();   //直接使用类名点调用就可以
    }
}

class OuterClass1 {
    static class InnerClass1 {
        public void method (){
            System.out.println("这是静态内部类的方法。");
        }
    }

    static class Inner1 {
        public static void method1(){
            System.out.println("这是静态内部类中的静态方法");
        }
    }
}

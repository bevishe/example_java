package com.ldu.bevishe.day7;

public class Demo2_InnerClass {
    public static void main(String[] args) {
        OuterClass i = new OuterClass();
        i.print();
    }
}

class OuterClass {
    private class InnerClass {
        public void menthod (){
            System.out.println("内部类");
        }
    }

    public void print (){
        InnerClass i = new InnerClass();
        i.menthod();
    }
}
package com.ldu.bevishe.day2;

public class Demo_Final {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}

class Father {
    public final void print(){
        System.out.println("访问底层数据资源。");
    };
}

class Son extends Father{
//    public void print(){
//        System.out.println("Father 的print被我干掉了");
//    }


}
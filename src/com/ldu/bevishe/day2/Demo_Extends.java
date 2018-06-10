package com.ldu.bevishe.day2;

public class Demo_Extends {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.print();
        z.work();
    }
}

class Fu {
    public void print(){
        System.out.println("fu print");
    }
}

class Zi extends Fu{
    public void print(){
        super.print();
        System.out.println("zi print");
    }

    public void work(){
        System.out.println("zi word");
    }
}

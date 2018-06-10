package com.ldu.bevishe.day27;

public class Demo_Phone {
    String brand;
    int price;

    public void call(){
        System.out.println("call...");
    }

    public void sendMassage(){
        System.out.println("send massage.");
    }

    public void playGame(){
        System.out.println("play game....");
    }
}

class test_Phone{
    public static void main(String[] args) {
        Demo_Phone p = new Demo_Phone();
        p.playGame();
    }

}

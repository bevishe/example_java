package com.ldu.bevishe.day30;

public class Demo_Phone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("iphone");
        p.setPrice(1500);
        p.show();
    }
}
class Phone {
    private String brand;
    private int price;

    public Phone(){
        this.brand = "null";
        this.price = 0;
    }

    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void show(){
        System.out.println(this.brand+"........"+this.price);
    }
}

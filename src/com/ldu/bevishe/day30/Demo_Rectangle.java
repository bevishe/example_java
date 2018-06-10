package com.ldu.bevishe.day30;

public class Demo_Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,5);
        System.out.println("周长是"+r.getLength()+"，面积是"+r.getArea());
    }

}

/*
*  属性：
*       长，宽
*  空参有参的构造方法
*  方法：
*        set get
*        求周长
*        求面积
*
*
* */
class Rectangle {
    private int width;
    private int heigh;

    public Rectangle(){

    }

    public Rectangle(int width,int heigh){
        this.width = width;
        this.heigh = heigh;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;

    }

    public void setHeigh(int heigh){
        this.heigh = heigh;
    }

    public int getHigh(){
        return this.heigh;
    }

    public int getLength(){
        return 2*(this.heigh+this.width);
    }

    public int getArea(){
        return this.heigh*this.width;
    }
}

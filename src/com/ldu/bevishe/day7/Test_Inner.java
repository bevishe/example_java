package com.ldu.bevishe.day7;

public class Test_Inner {
    public static void main(String[] args) {
        Outer2.Inner2 i = new Outer2().new Inner2();
        i.show();
    }
}
//要求：使用已知的变量在控制台输出30,20,10
//内部类之所以可以获取外部类的成员，是因为他可以获取到外部类的外部类名。this
class Outer2 {
    public int num = 10;

    class Inner2 {
        public int num = 20;
        public void show(){
            int num = 30;
            System.out.println(num);    //就近原则
            System.out.println(this.num);//本类中的成员变量
            System.out.println(Outer2.this.num);//Outer2类中的成员变量
        }
    }
}


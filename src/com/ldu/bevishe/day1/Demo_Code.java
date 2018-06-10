package com.ldu.bevishe.day1;

public class Demo_Code {
    public static void main(String[] args) {
        {//局部代码块，限定了变量的生命周期
            int x = 10;
        }
        //System.out.println(x);
        Student s1 = new Student();
        System.out.println("*********************");
        Student s2 = new Student("zhang san",13);
    }
        static{
            System.out.println("我是主方法类中的静态代码块");
        }
}

class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("空参构造");
//        study();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
//        study();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    {//构造代码块没创建一次对象就会执行一次，会优先于构造函数执行
        System.out.println("我是构造代码块。");
    }
    public void study(){
        System.out.println("student study.");
        study();            //开发中用的很少
    }

    static {//随着类的加载而加载，只执行一次，作用是给类进行初始化，一般用来加载驱动
        System.out.println("我是静态代码块");
    }
}
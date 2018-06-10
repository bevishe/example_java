package com.ldu.bevishe.day25;

public class Demo_Employee {
    public static void main(String[] args) {
        Coder c = new Coder("张三","12345",1234);
        c.work();
        Manager m = new Manager("王五","1234567",12345,1356);
        m.work();


    }
}

abstract class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println(this.getName()+"敲代码"+",我的工号是"+this.getId()+",我的工资是"+this.getSalary());
    }

}

class Manager extends Employee {
    private int bonus;      //奖金

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    public Manager(String name, String id, double salary,int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("我的姓名是"+this.getName()+",我的工号是"+this.getId()
        +"，我的工资是"+this.getSalary()+",我的奖金是"+this.getBonus());
    }
}

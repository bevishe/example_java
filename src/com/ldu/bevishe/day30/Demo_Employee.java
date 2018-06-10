package com.ldu.bevishe.day30;

public class Demo_Employee {
    public static void main(String[] args) {
        Employee e = new Employee("令狐冲","9527",2000);
        e.Print();

    }
}
/*
* 属性：姓名 name
*       工号 id
*       工资 salary
* 方法：
*       构造方法
*       set get
*       显示成员信息
*       work
* */
class Employee {
    private String name;
    private String id;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public Employee() {

    }

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void Print(){
        System.out.println("员工姓名"+this.name+"工号"+this.id+"工资"+this.salary);

    }
}

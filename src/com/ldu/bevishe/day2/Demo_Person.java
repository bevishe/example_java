package com.ldu.bevishe.day2;

public class Demo_Person {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.eat();
        s.study();
        System.out.println(s.getName()+"-----"+s.getAge());
        System.out.println("***************************************");
        Student s2 = new Student("李四",20);
        System.out.println(s2.getName()+"-----"+s2.getAge());
        s2.study();
        System.out.println("***************************************");
        Teacher t = new Teacher("王五",30);
        System.out.println("老师 "+t.getName()+"-------"+t.getAge());
        t.teach();

    }


}
/*
* */

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println();
    }
}

class Student extends Person{
    public Student(){

    }

    public Student(String name,int age){
        super(name,age);
    }

    public void study(){
        System.out.println(super.getName()+"学生学习");
    }
//    private String name;    //姓名
//    private int age;        //年龄
//
//    public Student1() {
//
//    }
//
//    public Student1(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public void eat(){
//        System.out.println("学生吃饭");
//    }
//
//    public void study(){
//        System.out.println("学生学习");
//    }
}

class Teacher extends Person{
    public Teacher(){

    }

    public Teacher(String name,int age){
        super(name,age);
    }
//
//    private String name;    //姓名
//    private int age;        //年龄
//
//    public Teacher() {
//
//    }
//
//    public Teacher(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public void eat(){
//        System.out.println("老师吃饭");
//    }

    public void teach(){
        System.out.println("老师学习");
    }
}
package com.ldu.bevishe.day13.bean;


public class Student implements Comparable {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return name + "  [ " + chinese + " " + math + " " + english + " ]";
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        return this.chinese + this.math + this.english - student.chinese - student.math - student.english;
    }
}

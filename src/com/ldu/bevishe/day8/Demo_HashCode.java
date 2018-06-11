package com.ldu.bevishe.day8;

import com.ldu.bevishe.day6.Student1;

public class Demo_HashCode {
    public static void main(String[] args) {
        Object obj = new Object();
        int hashCode = obj.hashCode();
        System.out.println(hashCode);

        Student1 s1= new Student1();
        Student1 s2 = new Student1();
        int num1 = s1.hashCode();
        int num2 = s2.hashCode();
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}

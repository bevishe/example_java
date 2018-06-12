package com.ldu.bevishe.day8;

public class Demo_String {
    public static void main(String[] args) {
        String str = "abc";     //abc可以看成一个字符串对象
        System.out.println(str);    //String类重写了toString方法
        str = "def";                //当把def赋值给str,原来的abc就变成了垃圾
        System.out.println(str);



    }
}

package com.ldu.bevishe.day8;
//将字符串的第一个字母转换成大写的
public class Test2_String {
    public static void main(String[] args) {

        /*链式编程，只要保证每次调用玩方法之后返回的是对象，就可以继续调用
        * */
        String s = "helloWorlD";
        String s2 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.print(s2);
    }
}

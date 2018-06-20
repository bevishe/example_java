package com.ldu.bevishe.day10;

public class Demo3_Regex {
    /*预定义字符类
    . 任何字符（与行结束符可能匹配也可能不匹配）
    \d 数字：[0-9]
    \D 非数字： [^0-9]
    \s 空白字符：[ \t\n\x0B\f\r]
    \S 非空白字符：[^\s]
    \w 单词字符：[a-zA-Z_0-9]
    \W 非单词字符：[^\w]
    * */
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        //method6();
        //method7();
    }

    public static void method7() {
        String regex = "\\W";
        System.out.println(":".matches(regex));
        System.out.println("3".matches(regex));
    }

    public static void method6() {
        String regex = "\\w";//代表的是单个单词字符
        System.out.println("a".matches(regex));
        System.out.println("5".matches(regex));
        System.out.println(":".matches(regex));
        System.out.println("_".matches(regex));
    }

    public static void method5() {
        String regex = "\\S";//正则表示非空的一个字符即可
        System.out.println("f".matches(regex));
        System.out.println(" ".matches(regex));  //一个空字符所以为false
        System.out.println("fd".matches(regex));//是两个字符所以为false
    }

    public static void method4() {
        String regex = "\\s";
        String s = "    ";
        System.out.println(" ".matches(regex));
        System.out.println("\\t".matches(regex));           //因为idea中tab被自动变成了4个空格所以为false
        System.out.println("    ".matches(regex));          //在dos窗口下测试时没错的
        System.out.println(s.matches(regex));
    }

    //
    public static void method3() {
        String regex = "\\D";
        System.out.println("3".matches(regex));         //正则表达式表示的是除去数字外的任意一个字符
        System.out.println("ds".matches(regex));        //有那个字符所以是false
        System.out.println("s".matches(regex));
    }

    //测试了预定字符类中 \d 代表了一个数字，在字符串中使用的时候要在前面加上\作为转义
    public static void method2() {
        String regex = "\\d";
        System.out.println("4".matches(regex));
        System.out.println("43".matches(regex));
        System.out.println(" ".matches(regex));
    }

    //测试.的用法，不需要【】，.就代表任意一个字符
    public static void method1() {
        String regex = ".";
        System.out.println("a".matches(regex));
        System.out.println(".".matches(regex));
        System.out.println("^".matches(regex));
        System.out.println(" ".matches(regex));
        System.out.println("?".matches(regex));
    }
}

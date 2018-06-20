package com.ldu.bevishe.day10;
//正则表达式
public class Demo2_Regex {
    /*
     * [abc] a、b 或 c（简单类）
     * [^abc] 任何字符，除了 a、b 或 c（否定）
     * [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
     * [a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集）
     * [a-z&&[def]] d、e 或 f（交集）
     * [a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
     * [a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）
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

    //取值范围是在a-z之间并且不包括b-c之间的单个字符
    public static void method7() {
        String regex = "[a-z&&[^b-c]]";
        System.out.println("b".matches(regex));
        System.out.println("a".matches(regex));
    }

    //等价于 [a-z&&b-d] 代表取a-z并且在b-d之间的单个字符
    public static void method6() {
        String regex = "[a-z&&[b-d]]";
        System.out.println("a".matches(regex));
        System.out.println("c".matches(regex));
    }

    //等价于 [a-cd-h]  都是去两个范围的并集
    public static void method5() {
        String regex = "[a-c[f-h]]";
        System.out.println("b".matches(regex));
        System.out.println("g".matches(regex));
    }

    //&& 代表取交集  取得是a-z并且是b-c的单个字符
    public static void method4() {
        String regex = "[a-z&&b-c]";
        System.out.println("f".matches(regex));
        System.out.println("b".matches(regex));
    }

    //取得是并集   a-d和m-p的并集
    public static void method3() {
        String regex = "[a-dm-p]";
        System.out.println("c".matches(regex));
        System.out.println("e".matches(regex));
    }

    //单个大小写字母
    public static void method2() {
        String regex = "[a-zA-Z]";
        System.out.println("a".matches(regex));
        System.out.println("$".matches(regex));
    }

    public static void method1() {
        String regex1 = "[abc]";//abc中的任意一个都可以
        String regex2 = "[^abc]";  //代表除abc之外的所有单个字符都可以 ^代表否定
        //“10”代表两个字符
        System.out.println("a".matches(regex2));
    }
}

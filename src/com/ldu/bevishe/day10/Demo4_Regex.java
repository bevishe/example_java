package com.ldu.bevishe.day10;

public class Demo4_Regex {
    /*Greedy 数量词
    X? X，一次或一次也没有
    X* X，零次或多次
    X+ X，一次或多次
    X{n} X，恰好 n 次
    X{n,} X，至少 n 次
    X{n,m} X，至少 n 次，但是不超过 m 次
    * */
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        //method6();


    }

    public static void method6() {
        String regex = "[fda]{4,6}";                //前面的字符次数在两者之间均可
        System.out.println("dada".matches(regex));
        System.out.println("dadaf".matches(regex));
        System.out.println("dadddddaf".matches(regex));
    }

    public static void method5() {
        String regex = "[32]{5,}";              //前面的至少有几次
        System.out.println("22222".matches(regex));
        System.out.println("2322222".matches(regex));
        System.out.println("2222".matches(regex));
    }

    public static void method4() {
        String regex = "[325]{5}";                  //前面的恰好有五次
        System.out.println("23232".matches(regex));
        System.out.println("232325".matches(regex));
    }

    public static void method3() {
        String regex = "[345]+";            //+ 代表前面的一次到多次
        System.out.println("4".matches(regex));
        System.out.println("34".matches(regex));
        System.out.println("".matches(regex));
    }

    public static void method2() {
        String regex = "[4]*";                  //*包括前面的0次到多次
        System.out.println("".matches(regex));
        System.out.println("4".matches(regex));
        System.out.println("44".matches(regex));
        System.out.println("444".matches(regex));
        System.out.println("4445".matches(regex));
    }

    public static void method1() {
        String regex = ".?";                    //有任意一个字符，或者没有字符都行
        System.out.println("".matches(regex));
        System.out.println(" ".matches(regex));
        System.out.println(":".matches(regex));
    }
}

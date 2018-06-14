package com.ldu.bevishe.day9;

public class Demo3_Integer {
    public static void main(String[] args) {
        //method1();
        //method2();
        /*
      基本数据类型包装类有八种，其中其中都有parseXxx()方法，可以将这七种的字符串表现形式转换成基本数据类型

        * */
        String s1 = "true";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);

//        String s2 = "abc";
//        char c =              char类型的包装类中没有parseXxx方法
        //字符串到字符的转换可以使用toCharArrays可以将String转换为字符数组，其他七种包装类型都有parse方法
    }

    //将String转换为Integer转换为int
    public static void method2() {
        String str = "100";
        Integer in = new Integer(str);
        int i1 = in.intValue();
        int i2 = Integer.parseInt(str);     //推荐使用这种
    }

    //int转换成String
    public static void method1() {
        int i = 100;
        String s1 = i + "";                 //推荐
        System.out.println(s1);
        String s2 = String.valueOf(i);      //推荐使用
        System.out.println(s2);
        Integer in = new Integer(i);
        String s3 = in.toString();
        System.out.println(s3);
        String s4 = Integer.toString(i);
        System.out.println(s4);
    }
}

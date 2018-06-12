package com.ldu.bevishe.day8;

public class Demo3_String {

    public static void method1() {
        //1,判断==和equal
        /*注意：
                两个结果都是true，why？
                字符串是常量，abc创建时存在是在常量池中，常量池中没有这个字符串对象就创建一个，有的话直接用就行
        * */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }

    public static void method2() {
        //2.创建了几个对象？
        String s2 = new String("abc");
        System.out.println(s2);

        /*
       创建了两个对象，一个在常量池中，一个在堆中，堆中的是常量池中的副本
        * */
    }

    public static void method3() {
        //3.判断下列的输出结果
        String s1 = new String("abc");          //记录的是堆中的地址值
        String s2 = "abc";                               //记录的是常量池中的地址值
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        /*输出：
                == false
                equals true
           why？
               new String（“abc”）；会创建出两个对象，分别在常量池和堆中
               s1指向的是堆中的对象，而s2指向的是常量池中的对象
               ==对于基本数据类型比较的是值，引用数据类型比较的地址值
               equals在String进行了重写，对于字符串只是比较字符串是否一样
        * */
    }

    public static void method4() {
        //4.判断下列的输出结果
        //byte b = 3 + 4;           在java中有常量优化机制，在编译的时候已经变成了7
        String s1 =  "a"+"b"+"c";      //同样在编译的时候已经变成了abc字符串，存在于常量池之中
        String s2 = "abc";             //常量池中已经有abc直接用就行
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //输出的都应该是true
    }

    public static void method5() {
        //5.判断下列的输出结果
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3==s2);
        System.out.println(s3.equals(s2));
        /*输出结果：
                    false
                    true
                    why? s3=s1+"c"中s1是一个变量只有c是存在于常量池之中，加号底层实现是用Stringbuffer或者
                    Stringbuilder用append方法实现的，s3指向的对象存在于堆之中
        * */
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();

    }
}

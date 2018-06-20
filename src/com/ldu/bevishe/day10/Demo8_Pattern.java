package com.ldu.bevishe.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式用于匹配字符串
public class Demo8_Pattern {
    public static void main(String[] args) {
        //method();
        String s = "我的手机号码是15665455521，曾经用过12345457878，还用过17853546118";
//        String regex = "1[32578]\\d{9}";                //手机号码的正则表达式
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(s);
        String regex = "1[32578]\\d{9}";                //手机号码的正则表达式
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
//        System.out.println(m.find());
//        System.out.println(m.group());    // 必须先find,find找到之后指针会自动匹配到下一个匹配的为，输出的即为下一个group（）
        while(m.find()){
            System.out.println(m.group());
        }
    }

    public static void method() {
        Pattern p = Pattern.compile("a*b");                     //获取了正则表达式
    Matcher m = p.matcher("aaaaaabaaab");               //获取匹配器
        boolean b = m.matches();                               //看是否能匹配（尝试与之匹配的是整个字符串）
        System.out.println(b);

        //与上面的方式的结果一样
        System.out.println("aaaaab".matches("a*b"));
    }
}

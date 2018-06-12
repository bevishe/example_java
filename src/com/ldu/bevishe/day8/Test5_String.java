package com.ldu.bevishe.day8;
//统计字符串中出现某个子串的个数

public class Test5_String {
    public static void main(String[] args) {
        String s1 = "hi,haow are you ,hi what is your name hi?";
        String s2 = "hi";
        int count = 0;
        int i = 0;
        while(true){
            if(s1.indexOf(s2,i)==-1)
                break;
            else{
                i = s1.indexOf(s2,i) + 1;
                count++;
            }
        }
        System.out.println(count);

    }
}

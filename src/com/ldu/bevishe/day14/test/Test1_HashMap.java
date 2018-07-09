package com.ldu.bevishe.day14.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test1_HashMap {
    //统计字符串中每个字符出现的次数
    public static void main(String[] args) {
        /*  1.输入字符串
            2.变为字符数组
            3.将字符存入HashMap集合之中
            4.如果put的返回值不为num，则将返回值加一
        * */

        System.out.println("请输入你的字符串：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] ch = line.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        Integer num;
        for (Character c : ch) {
            if((num = hashMap.put(c,1)) != null)
                hashMap.put(c,++num);
        }

        System.out.println("*************");
        System.out.println(hashMap);
    }
}

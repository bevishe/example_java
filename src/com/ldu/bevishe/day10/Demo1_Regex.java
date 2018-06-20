package com.ldu.bevishe.day10;

import java.util.Scanner;

public class Demo1_Regex {
    /*
    *校验QQ号
    * 0不能开头
    * 必须是数字
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号：");
        String qq = sc.nextLine();
        System.out.println(checkQQ(qq));
        String regex = "[1-9]\\d{4,14}";
        System.out.println(qq.matches(regex));
    }

    public static boolean checkQQ(String qq){
        boolean flag = true;
        if((qq.length() >= 5) && (qq.length() <= 15)){
            if (qq.substring(0, 1).equals("0")) {
                    flag = false;
            }else{//验证全部是数字
                char[] arr = qq.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char ch = arr[i];
                    if(!(ch >= '0' && ch <= '9')){
                        flag = false;
                        break;
                    }
                }
            }
        }else{
            flag = false;
        }
        return flag;
    }
}

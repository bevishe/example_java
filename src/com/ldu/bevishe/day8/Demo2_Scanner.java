package com.ldu.bevishe.day8;

import java.util.Scanner;

public class Demo2_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("i"+i+",j"+j);

        /**nextInt()是键盘录入整数的方法，当我们录入整数的时候，
         * nextInt只获取整数就结束了，nexLine是键盘录入字符串的方法，可以接受任意类型
         *但是它是通过遇到/r/n来判断一行结束
         *解决方案：
         *          1.创建一个新的Scanner对象，会浪费内存空间
         *          2.键盘录入的都是字符串，都使用nextInt（），然后把字符转换为整数类型的（推荐使用）
         */


        System.out.println("请输入第一个字符串：");
        String line1 = sc.nextLine();
        System.out.println("请输入第二个字符串：");
        String line2 = sc.nextLine();
        System.out.println(line1);
        System.out.println(line2);
    }
}

package com.ldu.bevishe.day8;

public class Demo2_String {
    public static void main(String[] args) {
        String str1 = new String();             //空字符串
        System.out.println(str1);

        //将byte数组转换为字符串
        byte[] arr1 = {97,98,99};               //解码，将计算机读的懂的，转换成我们看的懂的
        String str2 = new String(arr1);
        System.out.println(str2);

        //将字节数组从零索引开始转换三个变为字符串
        byte[] arr2 = {97,98,99,100,101,102};
        String str3 = new String(arr2,0,3);
        System.out.println(str3);

        //将char数组转换为字符串
        char[] arr3 = {'a','b','c','d'};
        String str4 = new String(arr3);
        System.out.println(str4);

        char[] arr4 = {'a','b','c','d','e'};
        String str5 = new String(arr4,1,3);
        System.out.println(str5);

        //将字符串常量转化为一个字符串
        String str6 = new String("hello");
        System.out.println(str6);
    }
}

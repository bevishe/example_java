package com.ldu.bevishe.day10;

public class Demo5_Split {
    public static void main(String[] args) {
        String s = "张三丰，郭靖，杨过";
        String[] arr = s.split("，");        //注意当用“.”去切分时 需要是用\\.才行，因为在正则中"."表示的是任意字符
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

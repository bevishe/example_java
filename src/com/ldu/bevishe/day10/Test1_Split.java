package com.ldu.bevishe.day10;

import java.util.Arrays;

public class Test1_Split {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        String[] arr = str.split(" ");              //将字符串切分我String数组
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {              //将Stirng数组变为int数组
            arrNew[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrNew);                               //使用数组工具类的sort方法进行排序

        //会产生很多的String对象垃圾
//        String str1 = "";
//        for (int i = 0; i < arrNew.length; i++) {
//            str1 = str1 + arrNew[i] + " ";
//        }
//        System.out.println(str1);

        //使用StringBuffer会节约内存，因为只创建了一个对象
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arrNew.length; i++) {
            if(i == arrNew.length - 1)
                sb = sb.append(arrNew[i]);
            else
                sb = sb.append(arrNew[i]).append(" ");

        }
        System.out.println(sb);
    }
}

package com.ldu.bevishe.day9;

import java.util.Arrays;


/*
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;                                        //最小索引
        int high = toIndex - 1;                                        //最大索引

        while (low <= high) {
            int mid = (low + high) >>> 1;                           //向右移动一位就是初以2
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
* */
//数组工具类
public class Demo1_Arrays {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
    }

    //调用Arrays中的binarySearch方法对数组进行二分查找
    public static void method3() {
        int[] arr = {21,454,675,2343,52325};
        System.out.println(Arrays.binarySearch(arr,675));
    }

    //调用Arrays中的sort方法对数组进行排序，底层是用快速排序实现的
    public static void method2() {
        int[] arr = {12,42,12,53465,32,52,2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //数组转字符串
    public static void method1() {
        int[] arr = {11,22,33,44,55};
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}

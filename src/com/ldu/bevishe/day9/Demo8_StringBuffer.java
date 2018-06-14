package com.ldu.bevishe.day9;

public class Demo8_StringBuffer {
    public static void main(String[] args) {
        //选择排序
        int[] arr= {12,42,23,545,23,6};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(getIndex(arr,24));
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {          //外圈找出每个索引上的最小值
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                }
            }
        }

    //二分查找法
    public static int getIndex(int[] arr,int i){
        int min = 0,max = arr.length - 1;
        int mid = (max + min)/2;
        while(arr[mid] != i){
            if(arr[mid] < i){
                min = mid + 1;
            }else if(arr[mid] > i){
                max = mid - 1;
            }
            mid = (min + max)/2;
            if(min > max)
                return -1;
        }
        return mid;
    }
}


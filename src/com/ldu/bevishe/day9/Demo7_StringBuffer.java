package com.ldu.bevishe.day9;
//冒泡排序
public class Demo7_StringBuffer {
    public static void main(String[] args) {
        int[] arr = {45,6,325,3,4,354,32};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

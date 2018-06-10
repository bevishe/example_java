package com.ldu.bevishe.day27;

public class Demo3 {
    public static int getIndex(int[] arr,int value){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        System.out.println("we find 22 is "+ getIndex(arr,22));

    }


}

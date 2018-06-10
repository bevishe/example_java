package com.ldu.bevishe.chapter5;

public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b;
        b=a;
        for(int i=0;i<b.length;i++){
            b[i]+=1;
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }

    }

}

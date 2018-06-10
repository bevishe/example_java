package com.ldu.bevishe.chapter5;

import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random ran = new Random(2);
        a = new int [ran.nextInt(1)];
        System.out.println(a.length);
    }

}

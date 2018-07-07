package com.ldu.bevishe.day12.jdk5;
import static java.util.Arrays.sort;
public class Demo3_StaticImport {
    public static void main(String[] args) {
        int[] arr = {234,532,24,6534,53,2,424,2,4};
        sort(arr); //开发中一般不这样使用，出现同名方法时还是需要加上前缀
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

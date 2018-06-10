package com.ldu.bevishe.util;

/*
* 1获取最大值
* 2数组的遍历
* 3.数组的反转
* */
public class ArrayTool {
    /**
     * 这是一个数组工具类，里面封装了查找数组最大值，打印数组，数组反转方法
     * @author hepeng
     * @version v1.0

     * */
    //如果一个类中所有的类都是静态的，需要多做一步，私有构造方法,目的是不让其他类来创建本类的对象
//    private ArrayTool(){
//
//    }
    /**
     * 这是获取数组最大值得方法
     * @param arr 接受一个int类型数组
     * @return 返回数组中的最大值
     * */
    public static int getMax(int [] arr) {
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    /**
     * 这是遍历数组的方法
     * @param arr 接受一个int类型的数组
     * */
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * 这是反转数组的方法
     * @param arr 接受一个int类型的数组
     * */

    public static void revArray(int[] arr){
        int temp = 0;
        for(int i = 0;i < arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }

    }

}

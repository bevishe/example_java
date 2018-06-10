package com.ldu.bevishe.day27;

public class Demo1 {
    // 打印数组
    public static void print(int[] str){
        for(int i = 0;i < str.length;i++){
            System.out.print(str[i]+"  ");
        }
    }

    //求最大值
    public static void getMax(int[] str){
        int max = str[0];
        for(int i = 1;i<str.length;i++){
            if(max<=str[i])
                max = str[i];
        }
        System.out.println("max = "+max);
    }

    //数组元素反转
    public static void reverseArray(int[] str){
        int count = str.length/2,temp = 0;
        for(int i = 0;i< count;i++){
            temp = 0;
            temp = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] str = new int[]{1,2,3,4,5};
        getMax(str);
        reverseArray(str);
        print(str);



    }
}

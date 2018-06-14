package com.ldu.bevishe.day9;

public class Test1_StringBuffer {
    /*使用StringBuffer而不使用String的好处：
    *   StringBuffer在内存中只会产生一个对象，而使用String来做会产生垃圾
    *   */
    public static String method(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1)
                sb.append(arr[i]).append("]");
            else
                sb.append(arr[i]).append(" ,");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(method(arr));
    }

}

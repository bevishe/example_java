package com.ldu.bevishe.day30;
import com.ldu.bevishe.util.ArrayTool;

public class Demo_ArrayTool {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55,66,77};
        ArrayTool at = new ArrayTool();
        int max = at.getMax(arr);
        System.out.println(max);
        System.out.println("-------------------");
        at.print(arr);
        System.out.println("-------------------");
        at.revArray(arr);
        at.print(arr);
    }

}

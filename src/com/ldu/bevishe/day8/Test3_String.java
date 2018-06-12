package com.ldu.bevishe.day8;

public class Test3_String {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "";
        for(int i = 0 ; i < arr.length ; i ++){
            s = s + arr[i];
            if(i != arr.length-1)
                s =s +  ",";
        }
        s = "[ " + s + " ]";
        System.out.print(s);
    }
}

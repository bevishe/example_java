package com.ldu.bevishe.day9;

public class Demo3_StringBuffer {
    public static void main(String[] args) {
        /*当缓冲区这个索引上没有元素时，就会报字符串索引异常
        * */
        StringBuffer sb = new StringBuffer("hi, you!");
        sb.deleteCharAt(3);
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("hi,how are you!");
        sb1.delete(2,14);                   //删除的时候是包含头不包含尾
        System.out.println(sb1);
        sb1.delete(0,sb1.length());             //清空缓冲区
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("hi,how are you!"); //字符串反转
        sb2.reverse();
        System.out.println(sb2);

    }
}

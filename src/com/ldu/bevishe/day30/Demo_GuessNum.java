package com.ldu.bevishe.day30;
import java.util.Scanner;
public class Demo_GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1到100的数字：");
        int gussNum = (int)(Math.random()*100)+1;
        while(true){
            int result = sc.nextInt();
            if(result > gussNum)
                System.out.println("你猜的数太大了：");
            else if(result < gussNum)
                System.out.println("你猜的数太小了：");
            else {
                System.out.println("恭喜你，猜对了。");
                break;
            }

        }

    }
}



package com.ldu.bevishe.day14.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test2 {
    /*模拟扑克牌的洗牌发牌
        1.买一副扑克，将扑克牌存储在集合中
        2.洗牌
        3发牌
        4看牌上
    * */
    public static void main(String[] args) {
        //创建集合对象
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"红桃","黑桃","方块","梅花"};
        ArrayList<String> poker = new ArrayList<>();

        //拼接字符串
        for (String c : color) {
            for (String n : num) {
                poker.add(c + n);
            }
        }
        poker.add("大王");
        poker.add("小王");

        Collections.shuffle(poker);

        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();

        while (poker.size() > 3){
            A.add(poker.remove(poker.size() - 1));
            B.add(poker.remove(poker.size() - 1));
            C.add(poker.remove(poker.size() - 1));
        }

        //看牌
        System.out.println("玩家A " + A);
        System.out.println("玩家B " + B);
        System.out.println("玩家C " + C);
        System.out.println("底牌 " + poker);

        //叫地主
        System.out.println("开始抢地主：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("A抢地主：（Y,N）");
        String lineA = scanner.nextLine();
        if(lineA.equals("Y")){
            A.addAll(poker);
        } else{
            System.out.println("B抢地主：（Y,N）");
            String lineB = scanner.nextLine();
            if (lineB.equals("Y")){
                B.addAll(poker);
            }
            else{
                System.out.println("C抢地主：（Y,N）");
                String lineC = scanner.nextLine();
                if (lineC.equals("Y"))
                    C.addAll(poker);
                else
                    System.out.println("底牌没人抢！");
            }
        }

        System.out.println("*******************************");
        System.out.println("玩家A " + A);
        System.out.println("玩家B " + B);
        System.out.println("玩家C " + C);
    }
}

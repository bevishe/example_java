package com.ldu.bevishe.day14.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3_Poker {
    //模拟扑克牌的洗牌发牌与排序
    public static void main(String[] args) {
        /*扑克牌是用HashMap双列集合来存储，k索引，v扑克牌
          洗牌时用ArrayList来洗k索引
          排序的时候用TreeSet来对玩家手里的k索引排序
        * */
        HashMap<Integer,String> hashMap = new HashMap<>();
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"红桃","黑桃","方块","梅花"};
        int count = 0;
        for (String n : num) {
            for (String c : color) {
                hashMap.put(count++,c + n);
            }
        }
        hashMap.put(52,"小王");
        hashMap.put(53,"大王");

        //准备洗牌
        ArrayList<Integer> poker = new ArrayList<>();
        poker.addAll(hashMap.keySet());
        Collections.shuffle(poker);

        //三个玩家集合，准备发牌
        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer> B = new TreeSet<>();
        TreeSet<Integer> C = new TreeSet<>();
        while(poker.size() > 3){
            A.add(poker.remove(poker.size() - 1));
            B.add(poker.remove(poker.size() - 1));
            C.add(poker.remove(poker.size() - 1));
        }

        ArrayList<TreeSet<Integer>> player = new ArrayList<>();
        player.add(A);
        player.add(B);
        player.add(C);
        for (TreeSet<Integer> thisPlayer: player){
            for (Integer i : thisPlayer) {
                System.out.print(hashMap.get(i) + " ");
            }
            System.out.println();
        }
        System.out.print("底牌：" );
        for (Integer i : poker) {
            System.out.print(hashMap.get(i) + " ");
        }

    }
}

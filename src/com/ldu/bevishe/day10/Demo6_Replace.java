package com.ldu.bevishe.day10;
//String中正则替换作用
public class Demo6_Replace {
    public static void main(String[] args) {
        String str = "独dfsf孤dfs34九__剑";
        String regex = "\\w";       //代表的是一个单词字符
        String str2 = str.replaceAll(regex,"");
        System.out.println(str2);
    }
}

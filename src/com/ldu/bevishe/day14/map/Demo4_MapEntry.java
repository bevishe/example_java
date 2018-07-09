package com.ldu.bevishe.day14.map;
//接口1.接口2
//表示接口2是接口1中的内部接口
public class Demo4_MapEntry {
    public static void main(String[] args) {

    }
}

interface Inter {
    interface Inter2 {
        public void show();
    }
}

class Demo implements Inter.Inter2 {
    @Override
    public void show() {

    }
}
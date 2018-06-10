package com.ldu.bevishe.chapter5;

import static com.ldu.bevishe.util.Print.*;

public class StaticInitialization {
    public static void main(String[] args) {
        print("create new cupboard in main");
        new Cupboard();
        print("create new cupboard in main ");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

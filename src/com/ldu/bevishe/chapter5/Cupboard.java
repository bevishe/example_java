package com.ldu.bevishe.chapter5;

import static com.ldu.bevishe.util.Print.*;

public class Cupboard {
    Bowl bowl43 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        print("Cupboard");
        bowl4.f1(2);
    }
    void f3(int marker){
        print("f3("+marker+")");
    }
    static Bowl bowl5 = new Bowl(5);
}

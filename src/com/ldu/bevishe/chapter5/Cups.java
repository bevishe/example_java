package com.ldu.bevishe.chapter5;

import static com.ldu.bevishe.util.Print.*;

public class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        println("cups()not print");
    }
}

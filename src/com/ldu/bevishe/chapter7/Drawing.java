package com.ldu.bevishe.chapter7;

import java.util.concurrent.atomic.AtomicBoolean;

public class Drawing extends Art {
    public Drawing() {
        System.out.println("this is drawing constructor.");
    }

    @Override
    public void hello() {
        System.out.println("my name is Drawing.");
    }
}

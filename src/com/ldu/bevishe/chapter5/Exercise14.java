package com.ldu.bevishe.chapter5;
import static com.ldu.bevishe.util.Print.*;
public class Exercise14 {
    public static  String firstName = "Bevis";
    static String secondName;
    static {
        secondName="He";
    }
    static public void myPrint(){
        secondName="print";
        println(firstName);
        println(secondName);
    }
}

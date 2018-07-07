package com.ldu.bevishe.day12.generic;

import com.ldu.bevishe.day12.bean.Tool;
import com.ldu.bevishe.day12.bean.Worker;
//tool是个工具类，加上泛型之后可以定义操作指定的引用类型，这样可以将运行期内的错误提前到编译期
public class Demo3_Generic {
    public static void main(String[] args) {
        //method1();
        Tool<String> tool = new Tool<>();
        tool.print("hello");
        tool.myPrint(true);         //其实有自动装箱过程，把boolean装箱为Boolean，基本数据类型变为一个引用数据类型
        Tool.hi(true);
    }

    public static void method1() {
        Tool<Worker> tool = new Tool<>();
        tool.setE(new Worker("Alen",23));
        System.out.println(tool.getE());
    }
}

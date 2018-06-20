package com.ldu.bevishe.day10;

public class Demo11_System {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        int[] src = {11,33,222,334,44};  //将数组内容拷贝
        int[] dest = new int[8];
        System.arraycopy(src,0,dest,1,5);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }

    public static void method3() {
        long start = System.currentTimeMillis();     //获取当前时间的毫秒值，是以1971年一月一日凌晨开始计算
        for (int i = 0; i < 1000; i++) {
            System.out.println("*");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void method2() {
        System.exit(0);         //非零状态是异常退出
        System.out.println("hello world");
    }

    public static void method1() {
        for (int i = 0; i < 1000; i++) {
            new Demo();
            System.gc();            //运行垃圾回收器
        }
    }
}

class Demo {   //在一个源文件中不允许定义两个用public定义的类

    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被清扫了");
    }
}
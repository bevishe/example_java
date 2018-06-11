package com.ldu.bevishe.day8;

import com.ldu.bevishe.day6.Student1;

public class Demo_ToString {
    /*com.ldu.bevishe.day6.Student1@140e19d
   左边：类名
   中间：@
   右边：hashcode的16进制表现形式
    一般要对其进行重写
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    toString()方法的作用，可以更方便的显示属性值
    getXxx（）方法是为了获取值，可以显示也可以赋值或做其他操作
    * */



    public static void main(String[] args) {
        Student1 s = new Student1("张三",23);
        String str = s.toString();
        System.out.println(str);

        //若果直接打印对象的引用，会默认的调用toString方法
        System.out.println(s);
    }
}

package com.ldu.bevishe.day9;

public class Test3_Integer {
    public static void main(String[] args) {
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        Integer i5 = 128;
        Integer i6 =128;
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));

        /*-128到127是byte的取值范围，若果在这个取值范围内，自动装箱就不会新创建对象，而是从常量池中获取
        如果超过了byte的取值范围就会在重新创建对象
        * */
    }
}

package com.ldu.bevishe.day10;

public class Demo7_Regex {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        /*替换：
                需求：我我....我...我.要...要要... 学学...编程
                将字符串还原为：我要学编程
        * */
        String s = "我我....我...我.要...要要...学学...编程";
        String regex1 = "\\.";
        String sb = s.replaceAll(regex1,"");
        System.out.println(sb);
        String s2 = sb.replaceAll("(.)\\1+","$1");      //$代表第一组中的内容
        System.out.println(s2);
    }

    public static void method3() {
        //需求：按照叠词切割
        String regex = "(.)\\1+";       //+代表第一组出现一次到多次
        String s = "sdqqfgkkkhjppppkl";
        String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void method2() {
        String regex = "(..)\\1";
        System.out.println("快乐快乐".matches(regex));
        System.out.println("快快乐乐".matches(regex));
    }

    public static void method1() {
        //叠词  快快乐乐，高高兴兴
        String regex = "(.)\\1(.)\\2";    //  \\1把第一组再出现一次   \\2代表第二组出现一次
        System.out.println("快快乐乐".matches(regex));
        System.out.println("高高兴兴".matches(regex));
    }
}

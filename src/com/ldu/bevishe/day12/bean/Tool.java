package com.ldu.bevishe.day12.bean;

//在自定义的类型中使用泛型
public class Tool<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public void print(E e){            //泛型方法中的泛型标识必须类上的泛型字母一致
        System.out.println(e);
    }
    //但是方法泛型最好和类泛型一致
    //泛型方法的字母也可和类泛型字母不一样，需要在public的后面加上泛型
    public<T> void myPrint(T t){
        System.out.println(t);
    }
    public static<Q> void hi(Q q){
        System.out.println(q);
    }
}

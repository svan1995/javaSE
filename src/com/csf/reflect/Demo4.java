package com.csf.reflect;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<?> aClass = Class.forName("com.csf.reflect.A");
//        System.out.println(aClass);

        Class<A> aClass1 = A.class;
        System.out.println(aClass1);

    }
}

class A{
    static {
        System.out.println("A类被初始化了");
    }
}

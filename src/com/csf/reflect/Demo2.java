package com.csf.reflect;

import java.lang.annotation.ElementType;

public class Demo2 {
    public static void main(String[] args) {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = void.class;
        Class c6 = ElementType.class;
        Class c7 = Override.class;
        Class c8 = Integer.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);

        //Alt+选中：多行复制
    }
}

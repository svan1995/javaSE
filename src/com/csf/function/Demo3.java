package com.csf.function;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        Predicate<String> p = x -> {
            System.out.println(x);
            return x.startsWith("c");
        };
        System.out.println(p.test("jj"));
    }
}

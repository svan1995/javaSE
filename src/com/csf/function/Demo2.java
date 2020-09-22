package com.csf.function;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> {
            System.out.println(x);
            return x+1;
        };
        Integer result = add.apply(4);
        System.out.println(result);
    }
}

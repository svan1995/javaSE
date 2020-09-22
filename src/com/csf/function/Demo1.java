package com.csf.function;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> {
            System.out.println(s + "111");
        };

        c1.accept("ccc");
    }
}

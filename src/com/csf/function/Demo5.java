package com.csf.function;

import java.util.Optional;

public class Demo5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        String s = optional.get();
        System.out.println(s);
    }
}

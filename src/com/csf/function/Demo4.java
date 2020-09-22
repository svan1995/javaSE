package com.csf.function;

import java.util.stream.Stream;

public class Demo4 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("hello", "world", "yy");
        System.out.println(s.isParallel());
        Stream<String> paralleS = s.parallel();
        System.out.println(paralleS == s);
        System.out.println(s.isParallel());
    }
}

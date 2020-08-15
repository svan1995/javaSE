package com.csf;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] strs = new String[] {"you","me"};
        List<String> strings = Arrays.asList(strs);
        strings.add("her");
        for (String s : strings){
            System.out.print(s);
        }
    }
}

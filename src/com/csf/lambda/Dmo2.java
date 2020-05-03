package com.csf.lambda;

public class Dmo2 {
    public static void main(String[] args) {
        ILove love = (a -> {
            System.out.println("I love " + a + " 元");
        });
        love.love(100);
    }
}

interface ILove{
    void love(int a);
}

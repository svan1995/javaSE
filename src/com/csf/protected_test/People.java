package com.csf.protected_test;

public class People implements Cloneable{
    protected void hello(){
        System.out.println("hello");
    }

    void sayhi(){
        System.out.println("hi");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

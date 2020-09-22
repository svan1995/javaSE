package com.csf.design_pattern.singleton.hungry;

public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();

    public static Singleton getSingleton(){
        return instance;
    }
}

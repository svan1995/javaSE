package com.csf.design_pattern.singleton.static_inner_class;

public class Singleton {
    private Singleton() {}
    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

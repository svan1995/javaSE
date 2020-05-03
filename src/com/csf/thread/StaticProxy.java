package com.csf.thread;

public class StaticProxy {
    public static void main(String[] args) {
//        Marry you = new You();
//        WeddingCompany weddingCompany = new WeddingCompany(you);
//        weddingCompany.happyMarry();
        new WeddingCompany(new You()).happyMarry();

        new Thread(()->{ System.out.println("love"); }).start();
    }
}

interface Marry{
    void happyMarry();
}

class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("要结婚了了");
    }
}

class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("收钱");
    }

    private void before() {
        System.out.println("布置现场");
    }
}

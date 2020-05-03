package com.csf.thread;

public class Demo4 implements Runnable {

    private int ticket = 10;

    public static void main(String[] args) {
        Demo4 ticket = new Demo4();
        new Thread(ticket, "小明").start();
        new Thread(ticket, "小红").start();
        new Thread(ticket, "小光").start();
    }

    @Override
    public void run() {
        while (true){
            if (ticket <= 0)
                break;
            System.out.println(Thread.currentThread().getName() + "==>拿到了第"+ (ticket--) + "张票");
        }
    }
}

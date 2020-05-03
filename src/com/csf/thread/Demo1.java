package com.csf.thread;

public class Demo1 {
    public static void main(String[] args) {
        Thread t = new TestThread1();
        t.start();
        for (int i=0; i<100; i++)
            System.out.println("1");
    }
}

class TestThread1 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<100; i++)
            System.out.println("2");
    }
}

package com.csf.thread;

public class Demo2 {
    public static void main(String[] args) {
        new Thread(new ThreadTest2()).start();
        for (int i=0; i<100; i++)
            System.out.println("1");
    }
}

class ThreadTest2 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<100; i++)
            System.out.println("2");
    }
}

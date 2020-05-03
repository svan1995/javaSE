package com.csf.thread;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Join(), "Vip");
        t1.start();
        for (int i=0; i<1000; i++){
            if (i==300){
                t1.join();
            }
            System.out.println("main"+ i);
        }
    }
}

class Join implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

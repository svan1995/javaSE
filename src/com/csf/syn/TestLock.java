package com.csf.syn;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        BuyTicket1 station = new BuyTicket1();
        new Thread(station, "station_1").start();
        new Thread(station, "station_2").start();
        new Thread(station, "station_3").start();
    }

}


class BuyTicket1 implements Runnable{

    private final ReentrantLock lock = new ReentrantLock();

    private int ticketnums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            buy();
        }
    }

    private void  buy(){
        lock.lock();
        if (ticketnums <= 0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "买到了第"+ ticketnums-- + "张票");
        lock.unlock();
    }

}
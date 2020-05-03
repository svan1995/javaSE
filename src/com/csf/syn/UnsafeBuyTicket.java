package com.csf.syn;

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();
        new Thread(station, "station_1").start();
        new Thread(station, "station_2").start();
        new Thread(station, "station_3").start();

        
    }
}

class BuyTicket implements Runnable{

    private int ticketnums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            buy();
        }
    }

    private synchronized void  buy(){
        if (ticketnums <= 0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "买到了第"+ ticketnums-- + "张票");
    }

}

package com.csf.thread;

public class TestStop implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run...Thread" + i++);
        }
    }

    public void stop(){
        flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        TestStop r1 = new TestStop();
        new Thread(r1).start();
        Thread.sleep(100);
        r1.stop();
    }
}

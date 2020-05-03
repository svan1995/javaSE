package com.csf.thread;

public class Demo3 {
    public static void main(String[] args) {
        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i=0; i<200;i++)
                    System.out.println("1");
            }
        }).start();
        for (int i=0; i<200;i++)
            System.out.println("2");
    }
}

package com.csf.syn;

public class DeadLock {
    public static void main(String[] args) {
        Makeup m1 = new Makeup(0, "girl_1");
        Makeup m2 = new Makeup(1, "girl_2");
        new Thread(m1).start();
        new Thread(m2).start();

    }
}

class Lipstick{

}

class Mirror{

}

class Makeup implements Runnable{

    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girl;

    public Makeup(int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {
        if (choice == 0){
            synchronized (lipstick){
                System.out.println(girl + "获得口红");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(girl + "获得镜子");
                }
            }
        }else{
            synchronized (mirror){
                System.out.println(girl + "获得镜子");
                Thread.sleep(2000);
                synchronized (lipstick){
                    System.out.println(girl + "获得口红");
                }
            }
        }
    }

}

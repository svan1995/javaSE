package com.csf.syn;

import java.awt.*;

//生产者消费者 利用缓冲区解决
public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();

    }
}

class Productor extends Thread{
    SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            container.push(new Product(i));
        }
    }
}


class Consumer extends Thread{
    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            container.pop();
        }
    }

}

class Product{
    public int id;

    public Product(int id) {
        this.id = id;
    }
}

class SynContainer{
    Product[] buffer = new Product[10];
    int count = 0;

    public synchronized void push(Product product){
        if (count >= buffer.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer[count] = product;
        count++;
        System.out.println("生产了"+ product.id + "个产品");

        this.notifyAll();
    }

    public synchronized Product pop(){
        if (count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        this.notifyAll();
        System.out.println("消费了"+ buffer[count].id + "个产品");
        return buffer[count];
    }

}
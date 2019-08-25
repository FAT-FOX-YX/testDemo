package com.example.demo.testOther.produceAndConsume;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {

    private final BlockingQueue proQueue;

    public ProducerQueue(BlockingQueue proQueue) {
        this.proQueue = proQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            try {
                System.out.println("生产者生产的编号 ： " + i);
                proQueue.put(i);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

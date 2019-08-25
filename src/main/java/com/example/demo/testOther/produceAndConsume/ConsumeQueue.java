package com.example.demo.testOther.produceAndConsume;

import java.util.concurrent.BlockingQueue;

public class ConsumeQueue implements Runnable {

    private BlockingQueue conQueue;

    public ConsumeQueue(BlockingQueue conQueue) {
        this.conQueue = conQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            try {
                System.out.println("消费者消费的编号 ： " + conQueue.take());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

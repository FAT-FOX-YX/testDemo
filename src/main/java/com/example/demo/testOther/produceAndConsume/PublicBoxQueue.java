package com.example.demo.testOther.produceAndConsume;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PublicBoxQueue {
    public static void main(String[] args) {
        BlockingQueue publicBoxQueue = new LinkedBlockingQueue(5);
        Thread pro = new Thread(new ProducerQueue(publicBoxQueue));
        Thread con = new Thread(new ConsumeQueue(publicBoxQueue));
        pro.start();
        con.start();
    }
}

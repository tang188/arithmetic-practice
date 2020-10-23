package com.example.arithmeticPractice.queue;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName SynchronousQueueTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/14 11:37
 * @Version 1.0
 **/
public class SynchronousQueueTest {

    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>(true);
        AtomicInteger integer = new AtomicInteger();
        AtomicInteger integer1 = new AtomicInteger();
        Runnable producer = () -> {
            try {
                queue.put("tangzhihong: " + integer.incrementAndGet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () -> {
            try {
                System.out.println("hello: " + queue.take() + integer1.incrementAndGet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(producer, "producer1").start();
        new Thread(producer,"producer2").start();
        new Thread(producer,"produce3").start();
        new Thread(consumer, "consumer1").start();
        new Thread(consumer, "consumer2").start();
        new Thread(consumer, "consumer3").start();


//        new Thread(consumer).start();

    }

}

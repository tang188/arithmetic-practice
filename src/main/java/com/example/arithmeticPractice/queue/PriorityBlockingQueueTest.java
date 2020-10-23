package com.example.arithmeticPractice.queue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @ClassName PriorityBlockingQueueTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/14 20:54
 * @Version 1.0
 **/
public class PriorityBlockingQueueTest {

    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);

        Integer a = queue.poll();
        System.out.println(a);
    }
}

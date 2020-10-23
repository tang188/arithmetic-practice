package com.example.arithmeticPractice.queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassName ArrayBlockingQueueTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/15 16:14
 * @Version 1.0
 **/
public class ArrayBlockingQueueTest {


    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(16);

//        for (int i = 0; i < 16; i++) {
//            queue.add(i);
//        }
//        for (int i = 0; i < 16; i++) {
//            System.out.println(queue.peek());
//        }
        for (int i = 0; i < 16; i++) {
            queue.put(i);
        }
        for (int i = 0; i < 16; i++) {
            System.out.println(queue.take());;
        }
        System.out.println(queue);
    }
}

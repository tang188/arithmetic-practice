package com.example.arithmeticPractice.concurrent;

import java.util.Date;

/**
 * @ClassName ThreadA
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 16:05
 * @Version 1.0
 **/
public class ThreadA implements Runnable {


    @Override
    public void run() {

        System.out.println("this is " + Thread.currentThread().getName() + new Date());
        try {
            Thread.sleep(3000);
            synchronized (ThreadA.class){
                System.out.println("synchronized ... " + Thread.currentThread().getName() + new Date());
                Thread.sleep(10 * 1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

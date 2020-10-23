package com.example.arithmeticPractice.thread;

import org.frameworkset.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/19 15:03
 * @Version 1.0
 **/
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Runner runner1 = new Runner();
        Thread currentThread = new Thread(runner1, "runner1");
        currentThread.start();
        TimeUnit.SECONDS.sleep(1);
        currentThread.interrupt();
        Runner runner2 = new Runner();
        Thread thread2 = new Thread(runner2, "runner2");
        thread2.start();

        TimeUnit.SECONDS.sleep(1);
        runner2.cancel();
    }

    private static class Runner implements Runnable{

        private int i = 0;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("count i = " + i);
        }

        public void cancel(){
            on = false;
        }
    }
}

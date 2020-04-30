package com.example.Others;

import org.junit.Test;

/**
 * @ClassName ThreadTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/27 15:21
 * @Version 1.0
 **/
public class ThreadTest {
    @Test
    public void test(){
        Lock lock = new Lock();
        try {
            new Thread(() -> {
                try {
                    lock.lock();
                    System.out.println("当前线程: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    lock.unlock();
                }catch (Exception e){
                    e.printStackTrace();
                }
            },"线程1").start();

            new Thread(() -> {
                try {
                    lock.lock();
                    System.out.println("当前线程: " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            },"线程2").start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //互斥锁
    public static class Lock{
        private boolean isLocked = false;
        public synchronized void lock() throws InterruptedException{
            while(isLocked){
                //当其他线程进来，直接让其进入等待状态，只有当最先拿到锁的资源，才能继续执行判断是否拿到锁
                wait();
            }
            isLocked = true;
        }
        public synchronized void unlock(){
            isLocked = false;
            notify();
        }
    }

    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.gc();
        Lock lock = new Lock();
        try {
            new Thread(() -> {
                try {
                    lock.lock();
                    System.out.println("当前线程: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    lock.unlock();
                }catch (Exception e){
                    e.printStackTrace();
                }
            },"线程1").start();

            new Thread(() -> {
                try {
                    lock.lock();
                    System.out.println("当前线程: " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            },"线程2").start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

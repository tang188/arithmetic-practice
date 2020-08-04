package com.example.arithmeticPractice.concurrent;

import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 11:36
 * @Version 1.0
 **/
public class MainClass {

    public static void main(String[] args) {
//        ThreadPoolExecutor
        Thread thread = new Thread(new ThreadA(), "threadA");
        Thread thread1 = new Thread(new ThreadA(), "threadB");
        Thread thread2 = new Thread(new ThreadA(), "threadC");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

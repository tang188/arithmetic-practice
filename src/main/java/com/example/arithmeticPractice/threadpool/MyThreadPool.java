package com.example.arithmeticPractice.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName MyThreadPool
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/8 10:40
 * @Version 1.0
 **/
public class MyThreadPool{

    //任务队列
    final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(100);

    //工作线程
    private List<Worker> workers;

    private volatile boolean working = false;

    public MyThreadPool(int poolSize) {
        if (poolSize <= 0){
            throw new IllegalArgumentException("");
        }
        workers = new ArrayList<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            Worker worker = new Worker(this);
            workers.add(worker);
            worker.start();
        }
    }

    public void shutdown(){
        //暂停接收任务    任务执行完worker停止运行     线程池关闭
        working = false;

        //中断阻塞进程，结束工作线程
        for (Worker worker : workers) {
            if (worker.getState() == Thread.State.BLOCKED
                    || worker.getState() == Thread.State.WAITING
                    || worker.getState() == Thread.State.TIMED_WAITING){
                //中断线程的阻塞和waiting。
                worker.interrupt();
            }
        }

    }

    public boolean submit(Runnable task){
        if (working){
            return this.queue.offer(task);
        }else {
            return false;
        }
    }

    class Worker extends Thread{
        MyThreadPool pool;
        @Override
        public void run() {
            //死循环取任务执行
            while (working){
                Runnable task = null;
                try {
                    task = pool.queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //中断时，这里task为空
                if (task != null){
                    try {
                        task.run();
                    }catch (Exception e){
                        //todo
                    }
                }
            }
        }

        public Worker(MyThreadPool pool) {
            this.pool = pool;
        }
    }

    class Task implements Runnable{
        private String context;

        public Task(String context) {
            this.context = context;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        @Override
        public void run() {

        }
    }
}

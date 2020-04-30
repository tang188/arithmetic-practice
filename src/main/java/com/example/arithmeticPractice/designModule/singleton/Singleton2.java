package com.example.arithmeticPractice.designModule.singleton;

/**
 * @ClassName SingleTon2
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/30 15:25
 * @Version 1.0
 **/
public class Singleton2 {

    /**
     * 懒汉式
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：易
     * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
     * 优点：第一次调用才初始化，避免内存浪费。
     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
     */
    private static Singleton2 singleTon2 ;

    private Singleton2(){}

    /**
     * 不安全
     * @return
     */
    public static Singleton2 getInstance(){
        if (singleTon2 == null){
            singleTon2 = new Singleton2();
        }
        return singleTon2;
    }

    /**
     * 安全
     * @return
     */
    public static synchronized Singleton2 getInstanceSave(){
        if (singleTon2 == null){
            singleTon2 = new Singleton2();
        }
        return singleTon2;
    }

    public void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Thread(()->{
            Singleton2 singleTon = Singleton2.getInstance();
            singleTon.sayHello();
        }, "thread1").start();
        new Thread(()->{
            Singleton2 singleTon = Singleton2.getInstance();
            singleTon.sayHello();
        }, "thread2").start();
    }
}

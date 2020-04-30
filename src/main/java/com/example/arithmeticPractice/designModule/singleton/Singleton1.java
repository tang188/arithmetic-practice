package com.example.arithmeticPractice.designModule.singleton;

/**
 * @ClassName DesignModule_Singleton
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/30 14:47
 * @Version 1.0
 **/
public class Singleton1 {

    /**
     * 饿汉式单例：
     * 是否 Lazy 初始化：否
     * 是否多线程安全：是
     * 实现难度：易
     *
     * 描述：这种方式比较常用，但容易产生垃圾对象。
     * 优点：没有加锁，执行效率会提高。
     * 缺点：类加载时就初始化，浪费内存。
     * 它基于 classloader 机制避免了多线程的同步问题，
     * 不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
     * 在单例模式中大多数都是调用 getInstance 方法，
     * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
     * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
     */
    private static Singleton1 instance = new Singleton1();

    //私有构造器
    private Singleton1(){}

    /**
     * 饿汉形式
     * 实例获取方法
     * @return
     */
    public static Singleton1 getInstance(){
        return new Singleton1();
    }

    public void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {

        new Thread(() -> {
            Singleton1 singleton1 = getInstance();
            singleton1.sayHello();
        }, "thread1").start();
        new Thread(() -> {
            Singleton1 singleton1 = getInstance();
            singleton1.sayHello();
        }, "thread2").start();
    }
}

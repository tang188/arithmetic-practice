package com.example.arithmeticPractice.designModule.singleton;

/**
 * @ClassName Singleton3
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/30 15:36
 * @Version 1.0
 **/
public class Singleton3 {

    /**
     * 双检锁模式
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：较复杂
     * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
     * getInstance() 的性能对应用程序很关键。
     */
    private static volatile Singleton3 instance ;

    private Singleton3 (){

    }

    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

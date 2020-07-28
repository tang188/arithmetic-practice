package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.singleton;

/**
 * @ClassName SingletonLanHan
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 15:29
 * @Version 1.0
 **/
public class SingletonLanHan {

    /**
     * 单例模式的懒汉式:线程不安全
     */
    private static SingletonLanHan instance;

    private SingletonLanHan(){

    }

    public SingletonLanHan getInstance(){
        if (instance == null){
            return new SingletonLanHan();
        }
        return instance;
    }

    /**
     * 懒汉式：线程安全
     */
    private static SingletonLanHan instance2;

    public synchronized SingletonLanHan getInstance2(){
        if (instance2 == null){
            return new SingletonLanHan();
        }
        return instance2;
    }

    /**
     * 懒汉式：线程不安全，不可用
     * 虽然加了锁，但是还是不安全
     * 线程1走到锁里面时，还没有做好初始化，线程2走到判空，一样会等待锁再次实例化instance。
     */
    public SingletonLanHan getInstance3(){
        if (instance2 == null){
            synchronized (this){
                instance2 = new SingletonLanHan();
            }
        }
        return instance2;
    }

    /**
     * 单例模式懒汉式双重校验锁[推荐用]
     */
    private static volatile SingletonLanHan instance4;

    public SingletonLanHan getInstance4(){
        if (instance4 == null){
            synchronized (SingletonLanHan.class){
                if (instance4 == null){
                    instance4 =  new SingletonLanHan();
                }
            }
        }
        return instance4;
    }

    /**
     * 静态内部类：线程安全
     */
    private static class SingletonHolder{
        private static final SingletonLanHan instance = new SingletonLanHan();

    }

    public static final SingletonLanHan getInstance5(){
        return SingletonHolder.instance;
    }



}

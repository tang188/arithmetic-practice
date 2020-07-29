package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.singleton;

/**
 * @ClassName SingletonEHan
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 15:22
 * @Version 1.0
 **/
public class SingletonEHan {

    /**
     * 写法 1
     */
    private static volatile SingletonEHan instance = new SingletonEHan();
    private SingletonEHan(){

    }

    SingletonEHan getInstance(){
        return instance;
    }

    /**
     * 写法 2
     */
    private static SingletonEHan instance2;

    static {
        instance2 = new SingletonEHan();
    }

    SingletonEHan getInstance2(){
        if (instance2 == null){
            return new SingletonEHan();
        }
        return instance2;
    }
}

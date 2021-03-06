package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.singleton;

/**
 * @ClassName SingletonEnum
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 16:06
 * @Version 1.0
 **/
public enum SingletonEnum {

    INSTANCE{
        @Override
        public void show() {
            System.out.println("i have a apple!");
        }
    };

    public void show(){
        System.out.println("i have a pen!");
    }
}

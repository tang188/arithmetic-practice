package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.simpleFactory;

/**
 * @ClassName Gun
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:12
 * @Version 1.0
 **/
public class Gun implements Product {

    @Override
    public void action() {
        System.out.println("bang bang bang");
    }
}

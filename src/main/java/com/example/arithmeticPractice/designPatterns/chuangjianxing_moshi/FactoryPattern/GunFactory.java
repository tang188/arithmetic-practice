package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.FactoryPattern;

/**
 * @ClassName GunFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:48
 * @Version 1.0
 **/
public class GunFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Gun();
    }
}

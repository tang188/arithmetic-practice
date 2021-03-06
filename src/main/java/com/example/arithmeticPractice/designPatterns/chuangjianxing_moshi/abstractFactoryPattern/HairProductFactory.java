package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.abstractFactoryPattern;

/**
 * @ClassName HairProductFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:06
 * @Version 1.0
 **/
public class HairProductFactory implements AbstractFactory {
    @Override
    public Product createFood() {
        return new Food("hair");
    }

    @Override
    public Product createGun() {
        return new Gun("hair");
    }
}

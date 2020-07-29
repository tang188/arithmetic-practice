package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.FactoryPattern;

/**
 * @ClassName FoodFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:41
 * @Version 1.0
 **/
public class FoodFactory implements Factory {

    @Override
    public Product createProduct() {
        return new Food();
    }
}

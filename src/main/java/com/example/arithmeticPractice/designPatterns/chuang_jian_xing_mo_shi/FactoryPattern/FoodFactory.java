package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.FactoryPattern;

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

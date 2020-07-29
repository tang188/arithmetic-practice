package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.simpleFactory;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:14
 * @Version 1.0
 **/
public class MainClass {

    /**
     * 在简单工厂模式中，可以根据参数的不同返回不同类的实例。
     * 每次添加新的产品都需要改动产品工厂
     */

    public static void main(String[] args) {
        Product productFactory = ProductFactory.createProduct("food");
        productFactory.action();
        productFactory = ProductFactory.createProduct("gun");
        productFactory.action();
    }
}

package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.simpleFactory;

/**
 * 简单工厂模式
 * @ClassName SimpleFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:06
 * @Version 1.0
 **/
public abstract class ProductFactory {
    /**
     * 在简单工厂模式中，可以根据参数的不同返回不同类的实例。
     * 每次添加新的产品都需要改动产品工厂
     */
    static Product createProduct(String productType){
        switch (productType){
            case "food":
                return new Food();
            case "gun":
                return new Gun();
            default:
                return null;
        }
    }

    abstract  void action();

}

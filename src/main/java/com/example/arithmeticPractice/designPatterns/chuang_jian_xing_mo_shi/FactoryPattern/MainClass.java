package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.FactoryPattern;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:27
 * @Version 1.0
 **/
public class MainClass {

    /**
     * 工厂模式：工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生成具体的产品对象，
     *          这样做的目的是将产品类的实例化操作延迟到工厂子类中完成
     * Product：抽象产品
     * ConcreteProduct：具体产品
     * Factory：抽象工厂
     * ConcreteFactory：具体工厂
     */

    public static void main(String[] args) {
        Factory fc = new FoodFactory();
        Product p = fc.createProduct();
        p.action();
        fc = new GunFactory();
        p = fc.createProduct();
        p.action();
    }
}

package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.abstractFactoryPattern;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:13
 * @Version 1.0
 **/
public class MainClass {

    public static void main(String[] args) {

        /**
         * 抽象工厂
         * 添加新的产品对象时，难以扩展抽象工厂来生产新种类的产品
         * 增加新的工厂和产品族容易，增加新的产品等级结构麻烦
         */

        AbstractFactory af = new HairProductFactory();
        af.createFood().action();
        af.createGun().action();
        af = new GeLiProductFactory();
        af.createFood().action();
        af.createFood().action();
    }
}

package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.abstractFactoryPattern;

/**
 * @ClassName GeLiProductFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:11
 * @Version 1.0
 **/
public class GeLiProductFactory implements AbstractFactory {

    @Override
    public Product createFood() {
        return new Food("GeLi");
    }

    @Override
    public Product createGun() {
        return new Gun("GeLi");
    }
}

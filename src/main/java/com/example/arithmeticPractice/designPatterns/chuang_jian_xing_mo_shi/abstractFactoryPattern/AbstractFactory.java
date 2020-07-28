package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.abstractFactoryPattern;

/**
 * @InterfaceName AbstractFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:02
 * @Version 1.0
 **/
public interface AbstractFactory {

    Product createFood();

    Product createGun();
}

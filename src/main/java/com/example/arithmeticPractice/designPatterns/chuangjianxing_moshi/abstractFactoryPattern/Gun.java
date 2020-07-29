package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.abstractFactoryPattern;

/**
 * @ClassName Gun
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 11:12
 * @Version 1.0
 **/
public class Gun implements Product {

    String name;

    public Gun(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println("gun from " + name + " :bang bang bang");
    }
}

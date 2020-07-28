package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.abstractFactoryPattern;

/**
 * @ClassName Food
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:04
 * @Version 1.0
 **/
public class Food implements Product{

    private String name;

    public Food(String name) {
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
        System.out.println("food from " + name + " :ze ze ze");
    }
}

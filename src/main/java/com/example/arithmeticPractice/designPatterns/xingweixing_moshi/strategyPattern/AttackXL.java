package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.strategyPattern;

/**
 * @ClassName AttackXL
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 18:01
 * @Version 1.0
 **/
public class AttackXL implements IAttack {
    @Override
    public void attack() {
        System.out.println("降龙十八掌 哈！");
    }
}

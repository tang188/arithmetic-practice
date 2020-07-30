package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.strategyPattern;

/**
 * 策略模式
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 17:55
 * @Version 1.0
 **/
public class MainClass {

    public static void main(String[] args) {
        Role role = new RoleA("李逍遥");
        role.setiAttack(new AttackXL());
        role.setiDefend(new DefendJZZ());
        role.setiRun(new Run1());
        role.setiDisplay(new DisplayNo());

        role.display();
        role.attack();
        role.defend();
        role.run();
    }
}

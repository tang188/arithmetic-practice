package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.strategyPattern;

/**
 * @ClassName Role
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 17:43
 * @Version 1.0
 **/
public abstract class Role {

    IAttack iAttack;

    IRun iRun;

    IDefend iDefend;

    IDisplay iDisplay;

    String name;

    public IAttack getiAttack() {
        return iAttack;
    }

    public void setiAttack(IAttack iAttack) {
        this.iAttack = iAttack;
    }

    public IRun getiRun() {
        return iRun;
    }

    public void setiRun(IRun iRun) {
        this.iRun = iRun;
    }

    public IDefend getiDefend() {
        return iDefend;
    }

    public void setiDefend(IDefend iDefend) {
        this.iDefend = iDefend;
    }

    public IDisplay getiDisplay() {
        return iDisplay;
    }

    public void setiDisplay(IDisplay iDisplay) {
        this.iDisplay = iDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        iDisplay.display();
    }

    void run(){
        iRun.run();
    }

    void attack(){
        iAttack.attack();
    }

    void defend(){
        iDefend.defend();
    }
}

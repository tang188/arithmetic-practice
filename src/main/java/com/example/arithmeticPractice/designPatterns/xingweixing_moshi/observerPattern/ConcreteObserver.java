package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.observerPattern;

/**
 * @ClassName ConcrereObserver
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 16:28
 * @Version 1.0
 **/
public class ConcreteObserver implements Observer {
    String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void updateMessage(String message) {
        System.out.println(name + " 在偷偷盯着 " + message);
    }
}

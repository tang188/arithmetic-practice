package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者具体实现
 * @ClassName ConcreteSubject
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 16:33
 * @Version 1.0
 **/
public class ConcreteSubject implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        observers.forEach(observer -> observer.updateMessage(message));
    }
}

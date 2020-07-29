package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.observerPattern;

/**
 * @ClassName Subject
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 16:31
 * @Version 1.0
 **/
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);

}

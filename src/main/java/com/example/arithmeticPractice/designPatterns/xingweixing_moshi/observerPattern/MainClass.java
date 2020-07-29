package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.observerPattern;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 16:36
 * @Version 1.0
 **/
public class MainClass {

    public static void main(String[] args) {
        Observer observer = new ConcreteObserver("张三");
        Observer observer1 = new ConcreteObserver("李四");

        Subject subject = new ConcreteSubject();
        subject.attach(observer);
        subject.attach(observer1);
        subject.notify("王舞洗澡！");

    }
}

package com.example.arithmeticPractice.designModule.factoryAbstract;

import com.example.arithmeticPractice.designModule.factory.Shape;

/**
 * @ClassName AbstractFactoryTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 14:41
 * @Version 1.0
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
//        FactoryProducer producer = new FactoryProducer();
        AbstractFactory abstractFactory = FactoryProducer.getFactory("shape");
        Shape shape = abstractFactory.getShape("circle");
        shape.draw();
    }
}

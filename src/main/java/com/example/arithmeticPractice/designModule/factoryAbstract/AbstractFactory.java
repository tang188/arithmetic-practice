package com.example.arithmeticPractice.designModule.factoryAbstract;

import com.example.arithmeticPractice.designModule.factory.Shape;

/**
 * @ClassName AbstractFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 14:21
 * @Version 1.0
 **/
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}

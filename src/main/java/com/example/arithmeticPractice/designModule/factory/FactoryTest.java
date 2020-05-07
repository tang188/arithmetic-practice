package com.example.arithmeticPractice.designModule.factory;

/**
 * @ClassName FactoryTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 14:12
 * @Version 1.0
 **/
public class FactoryTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}

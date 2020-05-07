package com.example.arithmeticPractice.designModule.factory;

/**
 * @ClassName Triangle
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 11:34
 * @Version 1.0
 **/
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a triangle");
    }
}

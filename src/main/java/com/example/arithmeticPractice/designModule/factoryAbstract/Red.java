package com.example.arithmeticPractice.designModule.factoryAbstract;

/**
 * @ClassName Red
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 14:21
 * @Version 1.0
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red!");
    }
}

package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.builderPattern;

/**
 * @ClassName Director
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:30
 * @Version 1.0
 **/
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    Computer getProduct(){
        builder.buildCpu();
        builder.buildGpu();
        return builder.getComputer();
    }
}

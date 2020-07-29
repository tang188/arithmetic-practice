package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.builderPattern;

/**
 * @ClassName AMDBuilder
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:28
 * @Version 1.0
 **/
public class AMDBuilder extends Builder {


    @Override
    void buildCpu() {
        computer.setCpu("AMD CPU");
    }

    @Override
    void buildGpu() {
        computer.setGpu("AMD GPU");
    }
}

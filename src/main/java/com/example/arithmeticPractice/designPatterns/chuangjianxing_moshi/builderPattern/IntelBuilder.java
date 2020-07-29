package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.builderPattern;

/**
 * @ClassName IntelBuilder
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:45
 * @Version 1.0
 **/
public class IntelBuilder extends Builder {
    @Override
    void buildCpu() {
        computer.setCpu("Intel CPU");
    }

    @Override
    void buildGpu() {
        computer.setGpu("NVIDIA GPU");
    }
}

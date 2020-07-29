package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.builderPattern;

/**
 * @InterfaceName Builder
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:26
 * @Version 1.0
 **/
public abstract class Builder {

    Computer computer = new Computer();

    abstract void buildCpu();

    abstract void buildGpu();

    Computer getComputer(){
        return computer;
    }
}

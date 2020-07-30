package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.adapterPattern;

/**
 * @ClassName V5PowerAdapter
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/30 10:13
 * @Version 1.0
 **/
public class V5PowerAdapter implements V5Power {

    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        //处理转换逻辑
        int aftPower = power - 215;
        return aftPower;
    }
}

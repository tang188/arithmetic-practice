package com.example.arithmeticPractice.designPatterns.chuangjianxing_moshi.builderPattern;

/**
 * @ClassName Computer
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:25
 * @Version 1.0
 **/
public class Computer {

    String cpu;

    String gpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    void show(){
        System.out.println(toString());
    }
}

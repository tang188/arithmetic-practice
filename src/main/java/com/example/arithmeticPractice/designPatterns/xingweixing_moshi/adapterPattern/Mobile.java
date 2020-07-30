package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.adapterPattern;

/**
 * @ClassName Mobile
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/30 10:10
 * @Version 1.0
 **/
public class Mobile {

    public void charge(V5Power v5Power){
        int v = v5Power.provideV5Power();
        System.out.println("充电中： " + v +" V");
    }
}

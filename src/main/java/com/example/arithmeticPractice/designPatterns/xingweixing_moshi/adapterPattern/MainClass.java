package com.example.arithmeticPractice.designPatterns.xingweixing_moshi.adapterPattern;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/30 10:10
 * @Version 1.0
 **/
public class MainClass {
    /**
     * 将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
     * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
     */
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        V5PowerAdapter adapter = new V5PowerAdapter(new V220Power());
        mobile.charge(adapter);
    }
}

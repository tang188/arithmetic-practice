package com.example.arithmeticPractice.designPatterns.chuang_jian_xing_mo_shi.builderPattern;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/28 14:40
 * @Version 1.0
 **/
public class MainClass {

    /**
     * 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合“开闭原则”。
     *
     * 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，
     * 如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
     * 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大。
     */

    public static void main(String[] args) {
        Director director = new Director(new AMDBuilder());
        director.getProduct().show();
        director = new Director(new IntelBuilder());
        director.getProduct().show();
    }
}

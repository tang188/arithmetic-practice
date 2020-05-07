package com.example.arithmeticPractice.designModule.factoryAbstract;

import org.springframework.util.StringUtils;

/**
 * @ClassName FactoryProducer
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 14:37
 * @Version 1.0
 **/
public class FactoryProducer {

    public static AbstractFactory getFactory(String f){
        if (StringUtils.isEmpty(f)){
            return null;
        }
        switch (f){
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            default:
                return null;
        }
    }

}

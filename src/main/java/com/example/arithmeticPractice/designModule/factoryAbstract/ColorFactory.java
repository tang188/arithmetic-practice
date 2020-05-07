package com.example.arithmeticPractice.designModule.factoryAbstract;

import com.example.arithmeticPractice.designModule.factory.Circle;
import com.example.arithmeticPractice.designModule.factory.Shape;
import com.example.arithmeticPractice.designModule.factory.Triangle;
import org.springframework.util.StringUtils;

/**
 * @ClassName ShapeFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 14:23
 * @Version 1.0
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (StringUtils.isEmpty(color)){
            return null;
        }
        switch (color){
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
       return null;
    }
}

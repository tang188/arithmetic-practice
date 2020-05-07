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
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (StringUtils.isEmpty(shape)){
            return null;
        }
        switch (shape){
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

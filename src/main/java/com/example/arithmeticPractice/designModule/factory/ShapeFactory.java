package com.example.arithmeticPractice.designModule.factory;

import org.springframework.util.StringUtils;

/**
 * @ClassName ShapeFactory
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/7 11:37
 * @Version 1.0
 **/
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (StringUtils.isEmpty(shapeType)){
            return null;
        }
        switch (shapeType){
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }

    }
}

package com.example.arithmeticPractice.classloader;

/**
 * @ClassName MyClassLoader
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/9 14:23
 * @Version 1.0
 **/
public class MyClassLoader {

    public static void main(String[] args) {
        ClassLoader classLoader = MyClassLoader.class.getClassLoader();
        while (classLoader != null){
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }
    }
}

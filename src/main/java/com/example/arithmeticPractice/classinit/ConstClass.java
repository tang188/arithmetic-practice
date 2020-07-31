package com.example.arithmeticPractice.classinit;

/**
 * @ClassName ConstClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 11:01
 * @Version 1.0
 **/
public class ConstClass {

    static {
        System.out.println("ConstClass init!");
    }
    public static final String HELLOWORLD = "hello world!";
}

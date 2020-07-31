package com.example.arithmeticPractice.classinit;

/**
 * @ClassName SubClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 11:00
 * @Version 1.0
 **/
public class SubClass extends SuperClass {

    static {
        System.out.println("sub class init");
    }

    static int val = 2048;
}

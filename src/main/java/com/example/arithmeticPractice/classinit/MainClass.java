package com.example.arithmeticPractice.classinit;

/**
 * @ClassName MainClass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 11:03
 * @Version 1.0
 **/
public class MainClass {

    public static void main(String[] args) {

        System.out.println(SubClass.val);

        SuperClass[] sca = new SuperClass[10];

        System.out.println(ConstClass.HELLOWORLD);
    }
}

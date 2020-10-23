package com.example.Others;

/**
 * @ClassName ThreadTest2
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/2 20:49
 * @Version 1.0
 **/
public class ThreadTest2 {

    private static volatile boolean flag = false;

    private static int m = 0;
    static void r(){
        while (flag){
            System.out.println();
//            Thread.yield();
        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        new Thread(() -> {
            r();
        }).start();
        flag = true;
        m = 83;
    }
}

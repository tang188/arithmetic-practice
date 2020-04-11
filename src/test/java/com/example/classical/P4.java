package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P4
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/11 16:52
 * @Version 1.0
 **/
public class P4 {
    /**
     * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
     */

    @Test
    public void test(){
        int a = 90;
        System.out.print(a + "=");
        split(a);
    }

    public void split(int a){
        boolean f = false;
        for (int i = 2;i < Math.sqrt(a); i ++){
            if (a % i == 0){
                System.out.print(i + "*");
                split(a / i);
                f = true;
                break;
            }
        }
        if (!f){
            System.out.print(a);
        }
    }
}

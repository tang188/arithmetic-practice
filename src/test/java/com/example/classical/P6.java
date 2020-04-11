package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P6
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/11 17:08
 * @Version 1.0
 **/
public class P6 {
    /**
     * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
     * 最大公约数：能同时被两个数整除
     * 最小公倍数：两个数的最小倍数
     */

    @Test
    public void test(){
        calc(10, 20);
        calc(1, 2);
        calc(27, 18);
    }

    public void calc(int a, int b){
        int min = a < b ? a: b;
        int max = a > b ? a: b;
        int minMulti = 1;
        for (int i = 2;i <= min; i++){
            if (a % i == 0 && b % i == 0){
                minMulti *= i;
                min /=  i;
                max /=  i;
                i = 2;
            }
        }
        System.out.print("最大公约数： " + minMulti);
        System.out.println("最小公倍数： " + a * b/minMulti);
    }
}

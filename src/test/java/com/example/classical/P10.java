package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P10
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/13 10:09
 * @Version 1.0
 **/
public class P10 {

    /**
     * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
     * 1.   50          100+50      100+100*1/2 + 100*1/2/2
     * 2.   25          50+25       f(n) = f(n-1) + f(n-2) + ... + f(0);
     * 3.   12.5
     * 4.   6.25
     * 5.   3.125
     */
    @Test
    public void test(){
        calc(10);
    }

    public void calc(int a){
        double f = 100;
        double sum = 0;
        for (int i = 0; i < a; i++) {
            sum += f/2 + f;
            f = f/2;
        }
        System.out.print(f);
        System.out.print("  ");
        System.out.println(sum);// 299.70703125
    }
}

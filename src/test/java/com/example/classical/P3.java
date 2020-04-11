package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P3
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/11 16:41
 * @Version 1.0
 **/
public class P3 {

    /**
     *  题目：打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。
     *  例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
     *  a = x%10
     */

    @Test
    public void test(){
        flower();
    }

    public void flower(){
        for (int i = 101; i < 999; i++){
            int res = 0;
            int ii = i;
            for (;ii > 0;){
                int a = ii % 10;
                res += Math.pow(a, 3);
                ii = ii / 10;
            }
            if (res == i){
                System.out.print(" " + i);
            }
        }
    }

}

package com.example.game.day0927;

import org.junit.Test;

/**
 * @ClassName P2
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/27 10:52
 * @Version 1.0
 **/
public class P2 {

    @Test
    public void test(){
        int[] customers = new int[]{10,10,6,4,7};
        int boardingCost = 3, runningCost = 8;
        int a = minOperationsMaxProfit(customers, boardingCost, runningCost);

        System.out.println(a == 36);
        System.out.println(a);
    }

    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int c = 0;
        int sum = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < customers.length || c > 0; i++) {
            if (i < customers.length)
                c += customers[i];
            int pc = c >= 4 ? 4 : c;
            c = c >= 4 ? c - 4:0;
            sum = sum + pc * boardingCost - runningCost;
            if (sum > max){
                max = sum;
                index = i + 1;
            }
        }
        return max > 0 ? index : -1;
    }
}

package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName Problem
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/21 11:49
 * @Version 1.0
 **/
public class Problem7 {
        /*
        给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
        示例 1:
        输入: 123
        输出: 321
         示例 2:
        输入: -123
        输出: -321
        示例 3:
        输入: 120
        输出: 21
        注意:
        假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0
         */
    @Test
    public void test(){
        reverse(-123456);
        reverse(-123406);
        System.out.println(reverse(1534236469));
    }

    public int reverse(int x) {
        long res = 0;
        for (; 0 != x;) {
            res = res * 10 + x%10;
            x = x/10;
        }
        return res < Integer.MIN_VALUE || res > Integer.MAX_VALUE? 0: (int) res;
    }
}

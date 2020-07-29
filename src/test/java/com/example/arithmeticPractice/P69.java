package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P69
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 10:40
 * @Version 1.0
 **/
public class P69 {
    /**
     * 实现 int sqrt(int x) 函数。
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     * 示例 1:
     * 输入: 4
     * 输出: 2
     * 示例 2:
     * 输入: 8
     * 输出: 2
     * 说明: 8 的平方根是 2.82842...,
     *      由于返回类型是整数，小数部分将被舍去。
     */

    @Test
    public void test(){
        System.out.println(mySqrt(121));
    }

    public int mySqrt(int x) {
        return (int) Math.sqrt(new Double(x));
    }

    @Test
    public void test1(){
        System.out.println(mySqrt1(2147483647));
    }

    /**
     *
     * @param x
     * @return
     */
    public int mySqrt1(int x) {
        if (x == 0){
            return 0;
        }
        long left = 0;
        long right = x;
        while (left < right){
            Long mid = Long.valueOf((left + right + 1) >> 1);
            if (x < mid * mid){
                right = mid - 1;
            }else {
                left = mid;
            }
        }
        return (int) left;
    }
}

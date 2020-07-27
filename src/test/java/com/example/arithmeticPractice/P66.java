package com.example.arithmeticPractice;

import org.junit.Test;

import javax.validation.constraints.Digits;

/**
 * @ClassName P66
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/27 22:14
 * @Version 1.0
 **/
public class P66 {
    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * 示例 1:
     * 输入: [1,2,3]
     * 输出: [1,2,4]
     * 解释: 输入数组表示数字 123。
     * 示例 2:
     * 输入: [4,3,2,1]
     * 输出: [4,3,2,2]
     * 解释: 输入数组表示数字 4321。
     */
    @Test
    public void test(){
        int[] digits = {1, 2, 3};
        digits = plusOne(digits);
        System.out.println(digits.toString());
        int[] digits1 = {9, 9, 9};
        digits1 = plusOne(digits1);
        System.out.println(digits1.toString());
        int[] d = plusOne(new int[]{ 2, 9, 9});
        System.out.println(d.length);
    }

    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag){
                int p = digits[i]+1;
                flag = p % 10 == 0;
                digits[i] = flag ? 0: p;
            }
            if (!flag){
                break;
            }
        }
        if (flag){
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            return newArray;
        }
        return digits;
    }
}

package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Problem9
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/21 15:59
 * @Version 1.0
 **/
public class Problem9 {
    /*
        判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        示例 1:
        输入: 121
        输出: true
        示例 2:
        输入: -121
        输出: false
        解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
        示例 3:
        输入: 10
        输出: false
        解释: 从右向左读, 为 01 。因此它不是一个回文数。
        进阶:
        你能不将整数转为字符串来解决这个问题吗？
    */

    @Test
    public void test(){
        System.out.println(isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        List<Integer> xs = new ArrayList();
        for (int i = 0; 0 < x; i++) {
            xs.add(x%10);
            x = x/10;
        }
        if (xs.size() == 1){
            return true;
        }
        if (xs.size()%2 == 0){
            int a = xs.size()/2;
            for (int i = 0;a + i < xs.size(); i++) {
                if (xs.get(a - i - 1) != xs.get(a + i)){
                    return false;
                }
            }
        }else {
            int a = xs.size()/2;
            for (int i = 0; a + i < xs.size(); i++) {
                if (xs.get(i + a) != xs.get(a - i)){
                    return false;
                }
            }
        }

        return true;
    }
}

package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P53
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/10 17:51
 * @Version 1.0
 **/
public class P53 {

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 示例:
     * 输入: [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */

    @Test
    public  void test(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int a = maxSubArray(nums);
        System.out.println(a);
    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < n; ++i) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}

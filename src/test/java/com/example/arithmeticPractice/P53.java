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


    @Test
    public  void test(){
        int[] nums = {6,1,-3,-1,9,-1,2,1,-5,4};
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

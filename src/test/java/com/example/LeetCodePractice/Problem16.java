package com.example.LeetCodePractice;

import org.junit.Assert;
import org.junit.Test;

import java.security.interfaces.RSAKey;
import java.util.Arrays;

/**
 * @ClassName Problem16
 * @Description
 * @Author tangzhihong
 * @Date 2019/12/2 17:50
 * @Version 1.0
 **/
public class Problem16 {

    /*
        给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
        例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
        与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).

        [0,2,1,-3]      1
     */
    @Test
    public void test(){
        int[] nums = new int[]{-1, 2, 1, -4};
        int s = threeSumClosest(nums, 1);
        System.out.println(s);
    }

    @Test
    public void test1(){
        int[] nums = new int[]{0,2,1,-3};
        int s = threeSumClosest(nums, 1);
        Assert.assertEquals(0, s);
    }

    public int threeSumClosest(int[] nums, int target){
        int result = 0;
        if (nums.length < 3){
            for (int anInt : nums) {
                result += anInt;
            }
            return result;
        }
        int[] newInts = new int[nums.length];
        int[] sortInts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortInts[i] = newInts[i] = nums[i] - target > 0 ? nums[i] - target: target - nums[i];
        }
        Arrays.sort(sortInts);
        int a1,a2,a3 = 0;
        a1 = sortInts[0];
        a2 = sortInts[1];
        a3 = sortInts[2];
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        for (int i = 0; i < newInts.length; i++) {
            if (a1 == newInts[i] && !flag1){
                result += nums[i];
                flag1 = true;
            }else if(a2 == newInts[i] && !flag2){
                result += nums[i];
                flag2 = true;
            }else if (a3 == newInts[i] && !flag3){
                result += nums[i];
                flag3 = true;
            }
            if (flag1 && flag2 && flag3){
                break;
            }
        }
        return result;
    }
}

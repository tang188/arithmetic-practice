package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P35
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/10 15:46
 * @Version 1.0
 **/
public class P35 {
    /*
        给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
        你可以假设数组中无重复元素。
        示例 1:
        输入: [1,3,5,6], 5
        输出: 2
        示例 2:
        输入: [1,3,5,6], 2
        输出: 1
        示例 3:
        输入: [1,3,5,6], 7
        输出: 4
        示例 4:
        输入: [1,3,5,6], 0
        输出: 0
    */

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){
                return i;
            }
            point = i;
        }
        return point + 1;
    }

    @Test
    public void test() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int a = searchInsert(nums, target);
        System.out.println(a);
    }

    @Test
    public void test1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int a = searchInsert(nums, target);
        System.out.println(a);
    }
}

package com.example.interview;

import org.junit.Test;

/**
 * @ClassName M0803
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 16:57
 * @Version 1.0
 **/
public class M0803 {
    /**
     * 魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。
     * 给定一个有序整数数组，编写一种方法找出魔术索引，
     * 若有的话，在数组A中找出一个魔术索引，
     * 如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。
     * 示例1:
     *  输入：nums = [0, 2, 3, 4, 5]
     *  输出：0
     *  说明: 0下标的元素为0
     * 示例2:
     *  输入：nums = [1, 1, 1]
     *  输出：1
     * 说明:
     * nums长度在[1, 1000000]之间
     * 此题为原书中的 Follow-up，即数组中可能包含重复元素的版本
     */

    @Test
    public void test(){
        int[] nums = new int[]{0, 2, 3, 4, 5};
        System.out.println(findMagicIndex(nums));;
    }

    public int findMagicIndex(int[] nums) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i){
                return i;
            }
        }
        return -1;
    }


    @Test
    public void test1(){
        int[] nums = new int[]{1 , 2, 3};
        System.out.println(findMagicIndex1(nums));;
    }
    public int findMagicIndex1(int[] nums) {
        return dichotomy(nums, 0, nums.length - 1);
    }

    public int dichotomy(int[] nums, int left, int right){
        if (left > right) return - 1;
        int mid = (left + right) / 2;
        int res = dichotomy(nums, left, mid - 1);
        if (res != -1){
            return res;
        }
        if (nums[mid] == mid){
            return mid;
        }
        return dichotomy(nums, mid + 1, right);
    }

}

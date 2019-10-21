package com.example.arithmeticPractice;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

/**
 * @ClassName Problem4
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/17 17:38
 * @Version 1.0
 **/
public class Problem4 {

    /*
        给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
        请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
        你可以假设 nums1 和 nums2 不会同时为空。
        示例 1:
        nums1 = [1, 3]
        nums2 = [2]
        则中位数是 2.0
        示例 2:
        nums1 = [1, 2]
        nums2 = [3, 4]
        则中位数是 (2 + 3)/2 = 2.5
        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    @Test
    public void test(){

        int[] a = {3};
        int[] b = {-2,-1};
        System.out.println(calcute(a, b));
        int[] c = {1 ,2};
        int[] d = {3,4};
        System.out.println(calcute(c, d));
    }

    public float calcute(int[] nums1, int[] nums2){
        float f1 = 0;
        float f2 = 0;
        if (nums1.length == 0){
            f1 = 0;
        }else if (nums1.length == 1){
            f1 = nums1[0];
        }else if (nums1.length % 2 == 0){
            f1 = ((float)(nums1[nums1.length/2 - 1] + nums1[nums1.length/2]))/2;
        }else {
            f1 = (nums1[nums1.length/2])/2;
        }

        if (nums2.length == 0){
            f2 = 0;
        }else if (nums2.length == 1){
            f2 = nums2[0];
        }else if (nums2.length % 2 == 0){
            f2 = ((float)(nums2[nums2.length/2 - 1] + nums2[nums2.length/2]))/2;
        }else {
            f2 = (nums2[nums2.length/2])/2;
        }
        if (nums1.length == 0){
            return f2;
        }
        if (nums2.length == 0){
            return f1;
        }
        return (f1 + f2)/2;
    }

    public double calculate2(int[] nums1, int[] nums2){
        int[] nums = new int[nums1.length + nums2.length];
        if (nums.length == 0){
            return 0;
        }
        if (nums1.length == 0){
            nums = nums2;
        }else if (nums2.length == 0){
            nums = nums1;
        }else {
            int n1 = 0;
            int n2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums1.length > n1){
                    int s1 = nums1[n1];
                    if (nums2.length > n2){
                        int s2  =nums2[n2];
                        if (s1 > s2){
                            nums[i] = s2;
                            n2++;
                        }else {
                            nums[i] = s1;
                            n1++;
                        }
                    }else {
                        nums[i] = nums1[n1];
                        n1++;
                    }
                }else {
                    if (nums2.length > n2){
                        nums[i] = nums2[n2];
                        n2++;
                    }else {
                        break;
                    }
                }
            }
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length % 2 == 0){
            return ((float)(nums[nums.length/2 - 1] + nums[nums.length/2]))/2;
        }else {
            return (float)(nums[nums.length/2]);
        }
    }

    @Test
    public void test1(){
        int[] c = {1 ,2};
        int[] d = {3,4};
        System.out.println(calculate2(c, d));
        int[] a = {3};
        int[] b = {-2,-1};
        System.out.println(calculate2(a, b));
    }
}

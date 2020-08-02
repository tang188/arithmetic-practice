package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P88
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/30 23:05
 * @Version 1.0
 **/
public class P88 {

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * 说明:
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     * 示例:
     * 输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * 输出: [1,2,2,3,5,6]
     */
    @Test
    public void test(){

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        boolean f1 = false;
        for (int i = 0; i < (m + n); i++) {
            f1 = nums1[i] > nums2[i] ;
            if (f1){
                int a = nums2[i];
                nums2[i] = nums1[i];
                nums1[i] = a;
            }else {

            }
        }
    }
}

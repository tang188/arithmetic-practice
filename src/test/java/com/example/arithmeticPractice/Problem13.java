package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Problem13
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/22 18:03
 * @Version 1.0
 **/
public class Problem13 {
    /*
        给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
        注意：答案中不可以包含重复的三元组。
        例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
        满足要求的三元组集合为：
        [
          [-1, 0, 1],
          [-1, -1, 2]
        ]
     */
    @Test
    public void test(){
//        [-1,0,1,2,-1,-4]
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List list = Arrays.asList(nums);
        return null;
    }
}

package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P26
 * @Description
 * @Author tangzhihong
 * @Date 2020/3/19 9:54
 * @Version 1.0
 **/
public class P26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[point] == nums[i]){

            }else {
                point ++;
                int value = nums[point];
                nums[point] = nums[i];
                nums[i] = value;
            }
        }
        return point + 1;
    }

    @Test
    public void test(){
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        int b = removeDuplicates(a);
        System.out.println(b);
    }

}

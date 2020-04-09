package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

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
        int value = nums[1];
        boolean f = false;
        for (int i = 1; i < nums.length; i++) {
            if (value == nums[i] && !f){
                point++;
                f = true;
            }else {
                nums[point] = nums[i];
                value = nums[point];
                point ++;
                f = false;
            }
        }
        return nums.length;
    }

    @Test
    public void test(){
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        int b = removeDuplicates(a);
        System.out.println(b);
    }


    public static void main(String[] args) {

        checkNum("123456789012");
    }
    public static void checkNum(String studentNo){
        String pattern = "^\\d{ " + studentNo+"}";
        if (!Pattern.matches(pattern, studentNo)){
            System.out.println("nonononononnnnoononononononononononononono");
        }
    }

    public void sorted(){
        List<SP> list = new ArrayList<>();
        list.add(new SP(12));
        list.add(new SP(13));
        list.add(new SP(14));
        list.add(new SP(15));

        list.sort((o1, o2) -> {
            return o1.getA() > o2.getA() ? -1 : 1;
        });
        System.out.println(list);
    }

    class SP{
        Integer a;

        public SP(Integer a) {
            this.a = a;
        }

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }
    }
}

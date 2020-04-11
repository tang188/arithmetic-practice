package com.example;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName TangzhihongTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/10 10:20
 * @Version 1.0
 **/
public class TangzhihongTest {

    @Test
    public void test(){
        Set<String> promotionList = new HashSet<>();
        promotionList.add("10137");
        promotionList.add("10138");
        Set<String> enrollPromotionIdSet = new HashSet<>();
        enrollPromotionIdSet.add("10135");
        enrollPromotionIdSet.add("10136");
        enrollPromotionIdSet.add("10137");
        //取交集
        promotionList.retainAll(enrollPromotionIdSet);
        System.out.println(promotionList);
    }

    @Test
    public void test1(){
        Set<String> promotionList = new HashSet<>();
        promotionList.add("10137");
        promotionList.add("10138");
        Set<String> enrollPromotionIdSet = new HashSet<>();
        enrollPromotionIdSet.add("10136");
        enrollPromotionIdSet.add("10138");
        //取交集
        promotionList.retainAll(enrollPromotionIdSet);
        System.out.println(promotionList);
    }

    @Test
    public void test2(){
        Set<String> promotionList = new HashSet<>();
        promotionList.add("10137");
        promotionList.add("10138");
        Set<String> enrollPromotionIdSet = new HashSet<>();
        enrollPromotionIdSet.add("10135");
        enrollPromotionIdSet.add("10136");
        enrollPromotionIdSet.add("10137");
        //取交集
        promotionList.retainAll(enrollPromotionIdSet);
        System.out.println(promotionList);
    }

    @Test
    public void test3(){
        Set<String> promotionList = new HashSet<>();
        promotionList.add("10137");
        promotionList.add("10138");
        Set<String> enrollPromotionIdSet = new HashSet<>();
        enrollPromotionIdSet.add("10135");
        enrollPromotionIdSet.add("10136");
        enrollPromotionIdSet.add("10137");
        //取交集
        promotionList.retainAll(enrollPromotionIdSet);
        System.out.println(promotionList);
    }

}

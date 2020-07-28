package com.example;

import com.example.Others.A;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.*;

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


    public static void main(String[] args) {
        A a = new A();
        a.setA(1);
        a.setB(null);
        CollectionUtils.isEmpty(a.getB());
        System.out.println(a);
    }


    @Test
    public void test11(){
        List<String> stringList = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        map.put("a", Arrays.asList("a"));
        stringList.add("String");
        stringList.addAll(new ArrayList<>(0));
        stringList.addAll(Optional.ofNullable(map.get("b")).orElse(new ArrayList<>(0)));

        System.out.println(stringList.size());
        stringList.forEach(s -> System.out.println(s));
    }
}

package com.example.arithmeticPractice.thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ConcurrentHashMapTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/22 0:03
 * @Version 1.0
 **/
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap();
        map.put("a", "a");
        map.put("a", "c");
        map.put("b", "b");
        String a = map.get("a");
        System.out.println("a :" + a);
        String c = map.get("c");
        System.out.println("c :" + c);
    }
}

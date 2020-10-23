package com.example.Others;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName WeiYunSuan
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/4 21:37
 * @Version 1.0
 **/
public class WeiYunSuan {

    @Test
    public void test(){
        int a = 1 << 5;
        String b = "a";
        int hash = b.hashCode();
        int c = hash >>> 16;
        int d = hash ^ c;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        Map map = new HashMap();
        map.put("tangzhihong", "tangzhihong");

    }
}

package com.example.Others;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/8/2 22:30
 * @Version 1.0
 **/
public class MapTest {

    @Test
    public void test(){
        Map map = new HashMap();
        map.put(null, null);
        map.put("a", null);
        map.put(null, null);
    }

    @Test
    public void testMap(){
        StringBuilder stringBuilder = new StringBuilder("tangzhihong");
        String a = "tangzhihong";
        int sum = 10000;
        HashMap map = new HashMap<String, String>();
        for (int i = 0; i < sum; i++) {
            map.put(a + i, a + i);
        }
    }
}

package com.example.arithmeticPractice;

import org.json.JSONObject;
import org.json.JSONStringer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ProjectName: arithmetic-practice
 * @Package: com.example.arithmeticPractice
 * @ClassName: Test
 * @Author: Handsome
 * @Description:
 * @Date: 2020/4/9 22:08
 * @Version: 1.0
 */
public class TangzhihongTest {


    @Test
    public void test1(){
        List<demo> demos = new ArrayList<>();
        demos.add(new demo("a", "a"));
        demos.add(new demo("b", "b"));
        demos.add(new demo("a", "c"));
        Map<String, demo> demoMap = demos.stream().collect(Collectors.toMap(demo::getKey, demo -> demo));
        System.out.println(demoMap.toString());
    }


    public static class demo{
        String key;

        String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public demo(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

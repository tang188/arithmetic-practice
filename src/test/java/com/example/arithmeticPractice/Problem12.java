package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName Problem12
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/22 15:25
 * @Version 1.0
 **/
public class Problem12 {
    /*
        编写一个函数来查找字符串数组中的最长公共前缀。
        如果不存在公共前缀，返回空字符串 ""。
        示例 1:
        输入: ["flower","flow","flight"]
        输出: "fl"
        示例 2:
        输入: ["dog","racecar","car"]
        输出: ""
        解释: 输入不存在公共前缀。
        说明:
        所有输入只包含小写字母 a-z 。
     */

    @Test
    public void test(){
        String[] strings = {"flower","flow","flowe"};
        String[] strings1 = {"","b"};
//        System.out.println(longestCommonPrefix(strings));
        System.out.println(longestCommonPrefix(strings1));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null){
            return "";
        }
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0] == null || strs[0].trim().length() == 0?"":strs[0];
        }
        char[] firstChars = (strs[0] == null || strs[0].trim().length() == 0?"":strs[0]).toCharArray();
        int pointer = firstChars.length;
        if (pointer == 0){
            return "";
        }
        for (int i = 1; i < strs.length; i++) {
            if (strs[i] == null || strs[i].trim().length() == 0){
                return "";
            }
            char[] processChars = strs[i].toCharArray();
            int processInt = processChars.length;
            pointer = pointer > processInt ? processInt:pointer;
            for (int j = 0; (pointer == 0 && j < processChars.length) || (pointer != 0 && pointer > j && j < processChars.length); j++) {
                if (firstChars[j] != processChars[j]){
                    pointer = pointer > j ? j:pointer;
                    if (pointer == 0){
                        return "";
                    }
                    break;
                }
            }
        }
        if (pointer != 0){
            return String.valueOf(firstChars).substring(0,pointer);
        }
        return "";
    }


    @Test
    public void test1(){
        String[] strings = {"flower","flow","flowe"};
        String[] strings1 = {"","b"};
        System.out.println(longestCommonPrefix1(strings));
        System.out.println(longestCommonPrefix1(strings1));
    }

    public String longestCommonPrefix1(String[] strs){
        if (strs == null){
            return "";
        }
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0] == null || strs[0].trim().length() == 0?"":strs[0];
        }
        int length = strs[0].length();
        int p = 0;

        for (int i = 0; i < strs.length; i++) {
            if (length>strs[i].length()){
                length = strs[i].length();
                p = i;
            }
        }
        if (length == 0){
            return "";
        }
        int[] chars = new int[length];
        char[] slowS = strs[p].toCharArray();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < length; j++) {
                if (slowS[j] == strs[i].toCharArray()[j]){
                    chars[j]++;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int a = chars[i];
            if (a == strs.length){
                builder.append(slowS[i]);
            }
        }
        return builder.toString();
    }
}

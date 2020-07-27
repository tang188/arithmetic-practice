package com.example.arithmeticPractice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * @ClassName P58
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/27 21:25
 * @Version 1.0
 **/
public class P58 {

    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     * 如果不存在最后一个单词，请返回 0 。
     * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
     * 示例:
     * 输入: "Hello World"
     * 输出: 5
     */
    @Test
    public void test(){
        Assert.assertEquals(lengthOfLastWord("Hello World"), 5);
        Assert.assertEquals(lengthOfLastWord("  "), 0);
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().equals("")){
            return 0;
        }
        String[] a = s.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i].length() != 0){
                return a[i].length();
            }
        }
        return 0;
    }
}

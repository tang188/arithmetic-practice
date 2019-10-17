package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName Problem3
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/17 17:18
 * @Version 1.0
 **/
public class Problem3 {

    /*
        给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
        示例 1:
        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:
        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:
        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
             请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

     */
    @Test
    public void test(){
        String s = "abcdefgaeg";
        int length = calculte(s);
        System.out.println(length);
    }

    private int calculte(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        String s1 = "";
        for (int i = 0; i < chars.length; i++) {
            char a = chars[i];
            int begin = s1.indexOf(a);
            if (begin != -1){
                s1 = s1.substring(begin + 1);
            }
            s1 = s1+a;
            length = length>s1.length()?length:s1.length();
        }
        return length;
    }
}

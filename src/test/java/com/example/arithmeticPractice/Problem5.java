package com.example.arithmeticPractice;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Problem5
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/18 15:26
 * @Version 1.0
 **/
public class Problem5 {

    /*
        给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

        示例 1：

        输入: "babad"
        输出: "bab"
        注意: "aba" 也是一个有效答案。
        示例 2：

        输入: "cbbd"
        输出: "bb"

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/longest-palindromic-substring
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

     */
    @Test
    public void test(){
        System.out.println(calculate2("cbbd"));
        System.out.println(calculate2("ac"));
    }

    public String calculate(String s){
        if(s == null || s.length() == 0){
            return "";
        }
        if (s.length() == 1){
            return s;
        }

        String res = String.valueOf(s.charAt(0));
        String rs = "";
        int length = 0;
        for (int i = 0; i < s.length() && length < s.length();) {
            String copyS = new String(s);
            int end = s.lastIndexOf(s.charAt(0));
            int begin = s.indexOf(s.charAt(s.length()-1));
            if (i == end){
                s = s.substring(1);
                continue;
            }else {
                String maybe = s.substring(0,end + 1);
                char[] chars = maybe.toCharArray();
                boolean flag = true;
                for (int j = 0; j < chars.length; j++) {
                    if (j<chars.length - j && chars[j] != chars[chars.length-j-1]){
                        if (copyS.length() - 1 == begin){
                            copyS = copyS.substring(0,copyS.length()-1);
                            continue;
                        }
                        String maybe2 = copyS.substring(begin);
                        char[] chars2 = maybe2.toCharArray();
                        boolean flag2 = true;
                        for (j = 0; j < chars.length; j++) {
                            if (j<chars2.length - j && chars2[j] != chars2[chars2.length-j-1]){
                                flag2 = false;
                                break;
                            }
                        }
                        if (flag2){
                            length = length>maybe2.length()?length:maybe2.length();
                            rs = length>maybe2.length()?rs:maybe2;
                        }
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    length = length>maybe.length()?length:maybe.length();
                    rs = length>maybe.length()?rs:maybe;
                }
                    s = s.substring(1,s.length() -1);
            }
        }

        if (res.length()>=rs.length()){
            return res;
        }else {
            return rs;
        }
    }

    public boolean huiwen(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i<chars.length - i && chars[i] != chars[chars.length-i]){
                return false;
            }
        }
        return true;
    }


    public String calculate2(String s){
        if(s == null || s.length() == 0){
            return "";
        }
        if (s.length() == 1){
            return s;
        }
        char[] chars = s.toCharArray();
        String rs = "";
        int length = 0;
        for (int i = 0; i < chars.length; i++) {
            int j=0;
            int k = 0;
            for (int i1 = 1; i1 < chars.length && i+i1<chars.length; i1++) {
                if (chars[i+i1] == chars[i]){
                    k++;
                }else {
                    break;
                }
            }
            for (;i-j>=0 && i+j+k<chars.length;){
                if (chars[i-j]==chars[i+k+j]){
                    j++;
                }else {
                    break;
                }
            }
            int length1 = s.substring(i - j + 1, i + j + k).length();
            rs = length > length1 ?rs:s.substring(i-j+1,i+j + k);
            length = length> length1 ?length: length1;
        }
        return rs;
    }
}

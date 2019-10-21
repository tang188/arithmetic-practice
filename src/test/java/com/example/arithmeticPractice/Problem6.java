package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.Calendar;

/**
 * @ClassName Problem6
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/21 10:45
 * @Version 1.0
 **/
public class Problem6 {

    /*

        将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
        比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
        L   C   I   R
        E T O E S I I G
        E   D   H   N
        之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
        请你实现这个将字符串进行指定行数变换的函数：
        string convert(string s, int numRows);
        示例 1:
        输入: s = "LEETCODEISHIRING", numRows = 3
        输出: "LCIRETOESIIGEDHN"
        示例 2:
        输入: s = "LEETCODEISHIRING", numRows = 4
        输出: "LDREOEIIECIHNTSG"
        解释:
        L     D     R
        E   O E   I I
        E C   I H   N
        T     S     G
     */

    @Test
    public void test(){
        String s1 = "LEETCODEISHIRING";
        System.out.println(convert(s1, 3));
        System.out.println(convert(s1, 4));
        System.out.println(convert(s1, 5));
        System.out.println(convert("abc", 2));
    }

    public String convert(String s, int numRows) {
        if (s == null){
            return s;
        }
        if (numRows < 2){
            return s;
        }
        if (s.length() == 0){
            return "";
        }
        if (s.length() < 3){
            return s;
        }
        int step = numRows*2 - 2;
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int i1 = 0; i + i1 * step < chars.length; i1++) {
                builder.append(chars[i + i1 * step]);
//                int  begin = step - i;
                if (i != 0 && (step-i) + i1 * step > 0 && (step-i) + i1 * step < chars.length && (step-i) + i1 * step != i + i1 * step){
                    builder.append(chars[(step-i) + i1 * step]);
                }
            }
        }
        return builder.toString();
    }
}

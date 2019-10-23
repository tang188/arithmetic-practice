package com.example.arithmeticPractice;

import org.junit.Test;

import java.nio.channels.NonWritableChannelException;

/**
 * @ClassName Problem11
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/22 14:36
 * @Version 1.0
 **/
public class Problem11 {
    /*
        罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
        字符          数值
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
        通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
        给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。

        示例 1:
        输入: 3
        输出: "III"
        示例 2:
        输入: 4
        输出: "IV"
        示例 3:
        输入: 9
        输出: "IX"
        示例 4:
        输入: 58
        输出: "LVIII"
        解释: L = 50, V = 5, III = 3.
        示例 5:
        输入: 1994
        输出: "MCMXCIV"
        解释: M = 1000, CM = 900, XC = 90, IV = 4.
     */
    @Test
    public void test(){
//        System.out.println(3999/1000);
//        System.out.println(999/1000);
        System.out.println(intToRoman(3));//III
        System.out.println(intToRoman(4));//IV
        System.out.println(intToRoman(9));//IX
        System.out.println(intToRoman(58));//LVIII
        System.out.println(intToRoman(1994));//MCMXCIV

        System.out.println(intToRoman(0));//""
        System.out.println(intToRoman(100));//C
    }

    public String intToRoman(int num) {
        if (num == 0){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        int q = num/1000;
        if (q != 0){
            for (int i = 0; i < q; i++) {
                builder.append("M");
            }
        }
        int b = (num - q * 1000)/100;
        if (b == 4){
            builder.append("CD");
        } else if (b == 9){
          builder.append("CM");
        }else {
            if (b >= 5){
                builder.append("D");
                for (int i = 0; i < b - 5; i++) {
                    builder.append("C");
                }
            }else {
                for (int i = 0; i < b; i++) {
                    builder.append("C");
                }
            }
        }

        int s = (num - q * 1000 - b * 100)/10;
        if (s == 4){
            builder.append("XL");
        }else if (s == 9){
            builder.append("XC");
        }else {
            if (s >= 5){
                builder.append("L");
                for (int i = 0; i < s - 5; i++) {
                    builder.append("X");
                }
            }else {
                for (int i = 0; i < s; i++) {
                    builder.append("X");
                }
            }
        }

        int g = (num - q * 1000 - b * 100 - s * 10)%10;
        if (g == 4){
            builder.append("IV");
        }else if (g == 9){
            builder.append("IX");
        }else {
            if (g >= 5){
                builder.append("V");
                for (int i = 0; i < g - 5; i++) {
                    builder.append("I");
                }
            }else {
                for (int i = 0; i < g; i++) {
                    builder.append("I");
                }
            }
        }
        return builder.toString();
    }


    @Test
    public void test1(){
        System.out.println(romanToInt("III"));//3
        System.out.println(romanToInt("IV"));//4
        System.out.println(romanToInt("IX"));//9
        System.out.println(romanToInt("LVIII"));//58
        System.out.println(romanToInt("MCMXCIV"));//1994

        System.out.println(romanToInt(""));//0
        System.out.println(romanToInt(null));//0
    }
    public int romanToInt(String s) {
        if (s == null || s.trim().equals("")){
            return 0;
        }
        char[] chars = s.toCharArray();
        int res = 0;
        int pre = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            int now = romanToInt1(chars[i]);
            res = pre <= now ? res+now:res-now;
            pre = now;
        }
        return res;
    }

    public int romanToInt1(char c){
        if (c == 'M'){
            return 1000;
        }else if (c == 'D'){
            return 500;
        }else if (c == 'C'){
            return 100;
        }else if (c == 'L'){
            return 50;
        }else if (c == 'X'){
            return 10;
        }else if (c == 'V'){
            return 5;
        }else {
            return 1;
        }
    }
}

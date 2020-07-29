package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P67
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/27 22:48
 * @Version 1.0
 **/
public class P67 {
    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     * 输入为 非空 字符串且只包含数字 1 和 0。
     * 示例 1:
     * 输入: a = "11", b = "1"
     * 输出: "100"
     * 示例 2:
     * 输入: a = "1010", b = "1011"
     * 输出: "10101"
     * 提示：
     * 每个字符串仅由字符 '0' 或 '1' 组成。
     * 1 <= a.length, b.length <= 10^4
     * 字符串如果不是 "0" ，就都不含前导零。
     */
    @Test
    public void test(){
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(
        addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011")
        );
    }

    public String addBinary(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int max = a.length() > b.length()? a.length() : b.length();
        boolean f = false;
        char[] newS = new char[max];
        for (int i = 0; i < ac.length || i < bc.length; i++) {
            char c1 = '0';
            char c2 = '0';
            if (i < ac.length){
                c1 = ac[ac.length - i - 1];
            }
            if (i < bc.length){
                c2 = bc[bc.length - i - 1];
            }

            char newC;
            if(f){
                f = c1 - '0' + c2 - '0' + 1 >= 2;
                newC = (char) (f ? c1 - '0' + c2 - '0' + 1 - 2 + '0' : c1 - '0' + c2 - '0' + 1 + '0');
            }else {
                f = c1 - '0' + c2 - '0' >= 2;
                newC = (char) (f ? c1 - '0' + c2 - '0' - 2 + '0' : c1 - '0' + c2 - '0' + '0');
            }
            newS[max - i - 1] = newC;
        }
        if (f){
            char[] res = new char[max + 1];
            res[0] = '1';
            System.arraycopy(newS, 0, res, 1, max);
            return new String(res);
        }
        return new String(newS);
    }
}

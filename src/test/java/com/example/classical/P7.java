package com.example.classical;

import org.junit.Test;

/**
 * @ProjectName: arithmetic-practice
 * @Package: com.example.classical
 * @ClassName: P7
 * @Author: Handsome
 * @Description: 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @Date: 2020/4/11 23:07
 * @Version: 1.0
 */
public class P7 {
    /**
     *   题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
     */
    @Test
    public void test(){
        countChar("1230abcd    `%$^");
    }
    public void countChar(String s){
        int z = 0;
        int k = 0;
        int sz = 0;
        int q = 0;
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || c >='A' && c <= 'Z'){
                z++;
            }else if (c == ' '){
                k++;
            }else if (c >= '0' && c <= '9'){
                sz++;
            }else {
                q++;
            }
        }
        System.out.println(z);
        System.out.println(k);
        System.out.println(sz);
        System.out.println(q);
    }
}

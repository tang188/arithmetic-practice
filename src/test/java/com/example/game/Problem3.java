package com.example.game;

import org.junit.Test;

/**
 * @ClassName Problem3
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/23 18:52
 * @Version 1.0
 **/
public class Problem3 {

    @Test
    public void test(){
        String s = "abcdefghijkozl 4";
        String[] ss = s.split(" ");
        if (ss.length == 1){
            System.out.println("");
        }
        s = ss[0];
        int i = Integer.parseInt(ss[1]);
        System.out.println(convert(s, i));
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
            StringBuilder builder = new StringBuilder(s);
            return builder.reverse().toString();
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
        return builder.reverse().toString();
    }
}

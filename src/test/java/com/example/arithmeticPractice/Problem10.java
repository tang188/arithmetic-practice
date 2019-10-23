package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName Problem10
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/21 16:27
 * @Version 1.0
 **/
public class Problem10 {
    /*
        给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
        '.' 匹配任意单个字符
        '*' 匹配零个或多个前面的那一个元素
        所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
        说明:
        s 可能为空，且只包含从 a-z 的小写字母。
        p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
        示例 1:
        输入:
        s = "aa"
        p = "a"
        输出: false
        解释: "a" 无法匹配 "aa" 整个字符串。
        示例 2:
        输入:
        s = "aa"
        p = "a*"
        输出: true
        解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
        示例 3:
        输入:
        s = "ab"
        p = ".*"
        输出: true
        解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
        示例 4:
        输入:
        s = "aab"
        p = "c*a*b"
        输出: true
        解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
        示例 5:
        输入:
        s = "mississippi"
        p = "mis*is*p*."
        输出: false
     */

    @Test
    public void test(){
//        isMatch("aa", "a");//false
//        isMatch("aa", "a*");//true
//        isMatch("aa", ".*");//true
        isMatch("aab", "c*a*b");//true
        isMatch("mississippi", "mis*is*p*.");
    }

    public boolean isMatch(String s, String p) {
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < pChars.length; i++) {
            char p1 = pChars[i];
            for (int j = builder.length(); j < sChars.length; j++) {
                if (sChars[j] == p1){
                    builder.append(sChars[j]);
                    break;
                }else {
                    if (p1 == '.'){
                        builder.append(sChars[j]);
                        break;
                    }
                    if (p1 == '*'){
                        char c = builder.charAt(builder.length() - 1);
                        if (c == sChars[j]){
                            builder.append(sChars[j]);
                            continue;
                        }else {
                            break;
                        }

                    }
                    builder.append(p1);
                    break;
//                    return false;
                }
            }
        }
        if (s.equals(builder.toString())){
            return true;
        }
        return false;
    }

}

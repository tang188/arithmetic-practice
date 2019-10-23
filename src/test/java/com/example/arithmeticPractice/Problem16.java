package com.example.arithmeticPractice;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName Problem16
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/23 14:50
 * @Version 1.0
 **/
public class Problem16 {
    /*
    字符串S和 T 只包含小写字符。在S中，所有字符只会出现一次。
    S 已经根据某种规则进行了排序。我们要根据S中的字符顺序对T进行排序。更具体地说，如果S中x在y之前出现，那么返回的字符串中x也应出现在y之前。
    返回任意一种符合条件的字符串T。
    示例:
    输入:
    S = "cba"
    T = "abcd"
    输出: "cbad"
    解释:
    S中出现了字符 "a", "b", "c", 所以 "a", "b", "c" 的顺序应该是 "c", "b", "a".
    由于 "d" 没有在S中出现, 它可以放在T的任意位置. "dcba", "cdba", "cbda" 都是合法的输出。
    注意:
    S的最大长度为26，其中没有重复的字符。
    T的最大长度为200。
    S和T只包含小写字符。
     */

    @Test
    public void test(){
       String S = "cba";
       String T = "abcd";
       System.out.println(customSortString(S, T));
    }
    public String customSortString(String S, String T) {
        if (S.length() == 0||T.length() == 0){
            return T;
        }
        char[] sChars = S.toCharArray();
        char[] tChars = T.toCharArray();
//        char[] chars = new char[T.length()];
        int k = 0;
        for (int i = 0; i < sChars.length; i++) {
            for (int j = k; j < tChars.length; j++) {
                if (tChars[j] == sChars[i]){
                    char a = tChars[j];
                    tChars[j] = tChars[k];
                    tChars[k] = a;
                    k++;

                }
            }
        }
        return new String(tChars);
    }
}

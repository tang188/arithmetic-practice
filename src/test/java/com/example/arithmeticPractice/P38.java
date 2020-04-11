package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P38
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/10 15:55
 * @Version 1.0
 **/
public class P38 {
    /*    「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：

                1.     1
                2.     11
                3.     21
                4.     1211
                5.     111221
                6.     312211
                7.     13112221
                8.     1113213211
                11. 11131221133112132113212221
                15. 311311222113111231131112132112311321322112111312211312111322212311322113212221

                1 被读作  "one 1"  ("一个一") , 即 11。
                11 被读作 "two 1s" ("两个一"）, 即 21。
                21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
        给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
        注意：整数序列中的每一项将表示为一个字符串。
        示例 1:
        输入: 1
        输出: "1"
        解释：这是一个基本样例。
        示例 2:
        输入: 4
        输出: "1211"
        解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。*/
    @Test
    public void test(){
        System.out.println(countAndSay(15));
    }

    public String countAndSay(int n) {
         return calc(n, "1");
    }

    public String calc(int n, String s){
        if (n == 1){
            return s;
        }else {
            char[] cs = s.toCharArray();
            char c = cs[0];
            int point = 0;
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == c){
                    point ++;
                    if (i == cs.length - 1){
                        res = res.append(point).append(c);
                    }
                }else {
                    res = res.append(point).append(c);
                    c = cs[i];
                    point = 1;
                    if (i == cs.length - 1){
                        res = res.append(1).append(c);
                    }
                }
            }
            return calc(n -1 ,res.toString());
        }
    }

}

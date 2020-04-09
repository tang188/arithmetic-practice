package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName P1160
 * @Description
 * @Author tangzhihong
 * @Date 2020/3/17 14:40
 * @Version 1.0
 **/
public class P1160 {
    /*
    给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
    假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
    注意：每次拼写时，chars 中的每个字母都只能用一次。
    返回词汇表 words 中你掌握的所有单词的 长度之和。
             
    示例 1：
    输入：words = ["cat","bt","hat","tree"], chars = "atach"
    输出：6
    解释：
    可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
    示例 2：
    输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
    输出：10
    解释：
    可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
    提示：
            1 <= words.length <= 1000
            1 <= words[i].length, chars.length <= 100
            所有字符串中都仅包含小写英文字母
     */
//    private static final int[] AllChar = new int[26];
//    // a = 97
//
//    static {
//        for (int i = baseUnicode; i < baseUnicode + AllChar.length; i++){
//            AllChar[i - baseUnicode] = 0;
//        }
//    }
    public int countCharacters(String[] words, String chars) {
        final int baseUnicode = 97;
        final int[] AllChar = new int[26];
        if (words == null || chars == null){
            return 0;
        }
        for (char c : chars.toCharArray()) {
            AllChar[c - baseUnicode]++;
        }
        return Arrays.asList(words)
                .stream()
                .reduce("", (s, s1) -> {
                    int[] temp = Arrays.copyOf(AllChar, AllChar.length);
                    for (char c : s1.toCharArray()) {
                        temp[c - baseUnicode]--;
                        if (temp[c - baseUnicode] < 0) {
                            return s;
                        }
                    }
                    return s.concat(s1);
                }).length();
    }
    @Test
    public void test1(){
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int a = countCharacters(words, chars);
        System.out.println("-----------------------.>>>>>>>>>> " + a);
    }


    @Test
    public void test(){
        char a = 'a';
        a = 98;
        System.out.println("------>>>>>>>>: " + a);
        int b = a + 1;
        System.out.println("------>>>>>>>>: " + b);
    }
}

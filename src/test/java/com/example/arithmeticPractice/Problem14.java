//package com.example.arithmeticPractice;
//
//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Stack;
//
///**
// * @ClassName Problem14
// * @Description
// * @Author tangzhihong
// * @Date 2019/10/23 10:58
// * @Version 1.0
// **/
//public class Problem14 {
//
//    /*
//        给定一个经过编码的字符串，返回它解码后的字符串。
//        编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
//        你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
//        此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
//        示例:
//        s = "3[a]2[bc]", 返回 "aaabcbc".
//        s = "3[a2[c]]", 返回 "accaccacc".
//        s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".
//     */
//    @Test
//    public void test(){
//        System.out.println(decodeString("3[a]2[bc]"));
//        System.out.println(decodeString("3[a2[c]]"));//accaccacc
//        System.out.println(decodeString("2[abc]3[cd]ef"));
//
//    }
//
//    String decodeString(String s) {
//        if (s == null){
//            return "";
//        }
//        Stack<Map<Integer, String>> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if ('0'<chars[i] && chars[i] <= '9'){
//                Map map = new HashMap();
//                map.put(new Integer(String.valueOf(chars[i])),);
//                stack.push()
//            }
//            stack.push(chars[i]);
//        }
//
//        poxi(s);
//        return "null";
//    }
//
//    String poxi(String s){
//
//        return "";
//    }
//}

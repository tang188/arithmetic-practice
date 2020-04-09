package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName P2
 * @Description
 * @Author tangzhihong
 * @Date 2020/3/17 16:06
 * @Version 1.0
 **/
public class P20 {
    /*
    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    有效字符串需满足：
        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串。
    输入: "()[]{}"
    输出: true
    示例 3:
    输入: "(]"
    输出: false
    示例 4:
    输入: "([)]"
    输出: false
    示例 5:
    输入: "{[]}"
    输出: true
     */

    public boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()){
                stack.push(c);
            }else {
                Character pref = stack.pop();
                if (map.containsKey(pref) && map.get(pref).equals(new Character(c))){
                    continue;
                }else {
                    stack.push(pref);
                    stack.push(c);
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    @Test
    public void test(){
        boolean a = isValid("[({(())}[()])]");
        System.out.println("------------------------------>>>> " + a);
        boolean b = isValid("()[]{}");
        System.out.println("------------------------------>>>> " + b);
        boolean c = isValid("(([)]{})");
        System.out.println("------------------------------>>>> " + c);
        boolean d = isValid("(([]){})");
        System.out.println("------------------------------>>>> " + d);
    }
}

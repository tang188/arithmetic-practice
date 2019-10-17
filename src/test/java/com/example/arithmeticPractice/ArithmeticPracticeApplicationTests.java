package com.example.arithmeticPractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArithmeticPracticeApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("hello");
    }

    /*
        给出两个 非空 的链表用来表示两个非负的整数。
        其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

        示例：
        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807
     */
    @Test
    public void test1() {

        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode pointer = null;
        int a = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null || p2 != null || a != 0) {
            int t1 = 0;
            int t2 = 0;
            if (p1 != null) {
                t1 = p1.val;
            }
            if (p2 != null) {
                t2 = p2.val;
            }
            ListNode node = new ListNode((t1 + t2 + a) % 10);
            if (res == null) {
                res = node;
                pointer = res;
            } else {
                pointer.next = node;
                pointer = pointer.next;
            }
            a = t1 + t2 + a >= 10 ? 1 : 0;
            System.out.println(a);
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }

        }
        return res;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /*
     给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
       示例 1:
       输入: "abcabcbb"
       输出: 3
       解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
       示例 2:
       输入: "bbbbb"
       输出: 1
       解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
       示例 3:
       输入: "pwwkew"
       输出: 3
       解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
            请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */
    @Test
    public void findDuplicateString() {
        String string = "abcabcbb";
        String string1 = "abc";
        int res = checkContainString(string,"");
        System.out.println(res);
    }

//    public int lengthOfLongestSubstring(String s) {
//        while ("".equals(checkContainString(s))) {
//
//        }
//        if ("".equals(checkContainString(s))) {
//            return s.length();
//        } else {
//
//        }
//        return 0;
//    }

    public int checkContainString(String s, String splitC) {

        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - 1;
        String splitChar = null;
        int length = 0;
        for (; i < a.length; i++, j--) {
            if (i < j) {
                if (splitC.equals(splitChar)){
                    List c = Arrays.asList(a);
                    c.remove(splitChar);
                }
                //这里要除去原来的那个字母，不然会永远为true
                if (s.contains(String.valueOf(a[i]))) {
                    splitChar = String.valueOf(a[i]);
                    break;
                }
                if (s.contains(String.valueOf(a[j]))) {
                    splitChar = String.valueOf(a[j]);
                    break;
                }
            }
        }
        if (splitChar == null) {
            return s.length();
        } else {
            Set<String> results = new HashSet<>();
            Map<String,Integer> res = new HashMap<>();
            String[] ss = s.split(splitChar);
            for (String s1 : ss) {
                s1 = splitChar+s1;
                results.add(s1);
            }

            results.stream().peek(as -> {
                res.put(as,as.length());
            }).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : res.entrySet()) {
                length = entry.getValue() >= length ? entry.getValue() : length;
            }
            final int l = length;
            results.clear();
            res.entrySet().forEach(re -> {
                if (re.getValue() == l){
                    results.add(re.getKey());
                }
            });
            Set<Integer> ls = new HashSet<>();
            for (String result : results) {
                ls.add(checkContainString(result,splitChar));
            }
            for (Integer integer : ls) {
                length = length >= integer ? length : integer;
            }
            return length;
        }
    }

}

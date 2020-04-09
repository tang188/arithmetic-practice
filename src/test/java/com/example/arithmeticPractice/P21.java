package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.List;

/**
 * @ClassName P21
 * @Description
 * @Author tangzhihong
 * @Date 2020/3/18 10:28
 * @Version 1.0
 **/
public class P21 {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = null;
        ListNode r = null;
        ListNode n1 = l1;
        ListNode n2 = l2;
        for (; n1 != null && n2 != null;){
            ListNode a = null;
            ListNode b = null;
            if (n1.val > n2.val){
                a = new ListNode(n2.val);
                n2 = n2.next;
            } else if (n1.val < n2.val){
                a = new ListNode(n1.val);
                n1 = n1.next;
            }else {
                a = new ListNode(n1.val);
                b = new ListNode(n1.val);
                n1 = n1.next;
                n2 = n2.next;
            }
            if (result == null){
                if (b != null){
                    result = a;
                    result.next = b;
                    r = result.next;
                }else {
                    result = a;
                    r = result;
                }
            }else {
                if (b != null){
                    r.next = a;
                    r = r.next;
                    r.next = b;
                    r = r.next;
                }else {
                    r.next = a;
                    r = r.next;
                }
            }
        }
        if (n1 != null){
            r.next = n1;
        }
        if (n2 != null){
            r.next = n2;
        }
        return result;
    }

    @Test
    public void test(){
        //[1,2,4]
        //[1,3,4]
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l4 = new ListNode(4);
        ListNode l44 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode p1 = l1;
        l1.next = l2;
        l2.next = l4;
        ListNode p2 = l11;
        l11.next = l3;
        l3.next = l44;
        ListNode result = mergeTwoLists(p1, p2);
        //1 1 2 3 4 4
        System.out.println(result);
    }

    @Test
    public void test1(){
        //[2]
        //[1]
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(1);
        ListNode result = mergeTwoLists(l1, l11);
        //1 1 2 3 4 4
        System.out.println(result);
    }

    @Test
    public void test2(){
        //[2]
        //[1]
        ListNode l1 = null;
        ListNode l11 = new ListNode(1);
        ListNode result = mergeTwoLists(l1, l11);
        //1 1 2 3 4 4
        System.out.println(result);
    }
}




 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P83
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/29 15:29
 * @Version 1.0
 **/
public class P83 {
    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     * 示例 1:
     * 输入: 1->1->2
     * 输出: 1->2
     * 示例 2:
     * 输入: 1->1->2->3->3
     * 输出: 1->2->3
     */
    @Test
    public void test(){
//        1->1->2->3->3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);

        ListNode a = deleteDuplicates(head);
        System.out.println(a);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = head;
        ListNode end = head.next;
        while (pre != null && end != null){
            if (end.val == pre.val){
                pre.next = end.next;
                end = end.next;
            }else {
                pre = pre.next;
                end = end.next;
            }
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}

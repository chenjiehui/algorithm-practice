package com.cjh.algorithm.linkedlist.swapnodes;

/**
 * Created by cjh on 2020/8/16.
 * 递归解法
 */
public class Solution1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}

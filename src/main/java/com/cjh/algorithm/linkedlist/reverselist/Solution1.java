package com.cjh.algorithm.linkedlist.reverselist;

/**
 * Created by cjh on 2020/8/15.
 * 双指针迭代
 */
public class Solution1 {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

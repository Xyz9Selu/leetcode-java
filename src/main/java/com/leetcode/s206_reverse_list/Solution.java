package com.leetcode.s206_reverse_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }

        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        // return if is last or is empty
        if (head == null || head.next == null) {
            return head;
        }

        // reverse next
        ListNode newHead = reverseList2(head.next);

        // reverse current head and next
        head.next.next = head;
        head.next = null;

        return newHead;
    }

}

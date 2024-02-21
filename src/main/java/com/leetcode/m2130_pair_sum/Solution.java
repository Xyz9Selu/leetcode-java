package com.leetcode.m2130_pair_sum;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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
    public int pairSum(ListNode head) {
        // find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        // reverse list2
        ListNode cur = head2;
        ListNode pre = null;

        while(cur != null) {
            ListNode tmpNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmpNext;
        }

        head2 = pre;

        // find max pare sum
        int maxPareSum = 0;
        ListNode cur1 = head;
        ListNode cur2 = head2;

        while(cur1 != null && cur2 != null) {
            maxPareSum = Math.max(maxPareSum, cur1.val + cur2.val);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return maxPareSum;
    }
}
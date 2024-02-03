package com.leetcode.m2095_delete_middle;

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null  && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public ListNode deleteMiddle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = new ListNode(-1, head);

        int moveCount = 0;
        while (fast != null) {
            fast = fast.next;
            if (moveCount % 2 == 1) {
                prev = slow;
                slow = slow.next;
            }

            moveCount ++;
        }

        // remove slow.next
        ListNode middle = prev.next;
        if (middle != null) {
            if (middle == head) {
                return null;
            }

            prev.next = middle.next;
        }    

        return head;
    }
}
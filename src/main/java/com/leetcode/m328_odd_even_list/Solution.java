package com.leetcode.m328_odd_even_list;

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
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        // null list or single node, just return head
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }


    public ListNode oddEvenList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head, even = head.next, evenHead = head.next;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;  // 将奇数部分的最后一个节点连接到偶数部分的第一个节点
        return head;
    }
}

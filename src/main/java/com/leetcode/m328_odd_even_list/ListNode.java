package com.leetcode.m328_odd_even_list;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode fromList(List<Integer> list) {
        ListNode head = null;
        for (int i = list.size() - 1; i >= 0; i --) {
            head = new ListNode(list.get(i), head);
        }

        return head;
    }

    public List<Integer> toList() {
        ListNode head = this;
        
        List<Integer> result = new ArrayList<>();
        ListNode cur = head;
        while(cur != null) {
            result.add(cur.val);
            cur = cur.next;
        }

        return result;
    } 
}
package com.leetcode.s206_reverse_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class SolutionTest {
    private ListNode toListNode(List<Integer> list) {
        ListNode head = null;
        for (int i = list.size() - 1; i >= 0; i --) {
            head = new ListNode(list.get(i), head);
        }

        return head;
    }

    private List<Integer> toList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode cur = head;
        while(cur != null) {
            result.add(cur.val);
            cur = cur.next;
        }

        return result;
    } 

    @Test
    public void reverseListTest() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(5, 4, 3, 2, 1), toList(solution.reverseList(toListNode(Arrays.asList(1, 2, 3, 4, 5)))));
        Assert.assertEquals(Arrays.asList(2, 1), toList(solution.reverseList(toListNode(Arrays.asList(1, 2)))));
        Assert.assertEquals(Arrays.asList(), toList(solution.reverseList(toListNode(Arrays.asList()))));
    }

    @Test
    public void reverseListTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(5, 4, 3, 2, 1), toList(solution.reverseList2(toListNode(Arrays.asList(1, 2, 3, 4, 5)))));
        Assert.assertEquals(Arrays.asList(2, 1), toList(solution.reverseList2(toListNode(Arrays.asList(1, 2)))));
        Assert.assertEquals(Arrays.asList(), toList(solution.reverseList2(toListNode(Arrays.asList()))));
    }

}
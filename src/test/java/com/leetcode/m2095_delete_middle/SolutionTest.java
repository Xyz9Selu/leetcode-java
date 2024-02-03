package com.leetcode.m2095_delete_middle;

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
    public void deleteMiddleTest() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(Arrays.asList(1,3,4,1,2,6), toList(solution.deleteMiddle(toListNode(Arrays.asList(1,3,4,7,1,2,6)))));
        Assert.assertEquals(Arrays.asList(1,2,4), toList(solution.deleteMiddle(toListNode(Arrays.asList(1,2,3,4)))));
        Assert.assertEquals(Arrays.asList(2), toList(solution.deleteMiddle(toListNode(Arrays.asList(2,1)))));
        Assert.assertEquals(Arrays.asList(), toList(solution.deleteMiddle(toListNode(Arrays.asList(1)))));
    }

    @Test
    public void deleteMiddleTest2() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(Arrays.asList(1,3,4,1,2,6), toList(solution.deleteMiddle2(toListNode(Arrays.asList(1,3,4,7,1,2,6)))));
        Assert.assertEquals(Arrays.asList(1,2,4), toList(solution.deleteMiddle2(toListNode(Arrays.asList(1,2,3,4)))));
        Assert.assertEquals(Arrays.asList(2), toList(solution.deleteMiddle2(toListNode(Arrays.asList(2,1)))));
        Assert.assertEquals(Arrays.asList(), toList(solution.deleteMiddle2(toListNode(Arrays.asList(1)))));
    }
}
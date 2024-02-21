package com.leetcode.m2130_pair_sum;

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
    public void pairSumTest() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.pairSum(toListNode(Arrays.asList(5,4,2,1))));
        Assert.assertEquals(7, solution.pairSum(toListNode(Arrays.asList(4,2,2,3))));
        Assert.assertEquals(100001, solution.pairSum(toListNode(Arrays.asList(1,100000))));
        Assert.assertEquals(182, solution.pairSum(toListNode(Arrays.asList(47,22,81,46,94,95,90,22,55,91,6,83,49,65,10,32,41,26,83,99,14,85,42,99,89,69,30,92,32,74,9,81,5,9))));
    }
}
package com.leetcode.m328_odd_even_list;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
    public void oddEvenListTest() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(1,3,5,2,4), toList(solution.oddEvenList(toListNode(Arrays.asList(1,2,3,4,5)))));
        Assert.assertEquals(Arrays.asList(2,3,6,7,1,5,4), toList(solution.oddEvenList(toListNode(Arrays.asList(2,1,3,5,6,4,7)))));
    }

    @Test
    public void oddEvenListTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(1,3,5,2,4), toList(solution.oddEvenList(toListNode(Arrays.asList(1,2,3,4,5)))));
        Assert.assertEquals(Arrays.asList(2,3,6,7,1,5,4), toList(solution.oddEvenList(toListNode(Arrays.asList(2,1,3,5,6,4,7)))));
    }
}

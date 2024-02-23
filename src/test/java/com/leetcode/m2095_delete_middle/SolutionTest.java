package com.leetcode.m2095_delete_middle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class SolutionTest {
    

    @Test
    public void deleteMiddleTest() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(Arrays.asList(1,3,4,1,2,6), solution.deleteMiddle(ListNode.fromList(Arrays.asList(1,3,4,7,1,2,6))).toList());
        Assert.assertEquals(Arrays.asList(1,2,4), solution.deleteMiddle(ListNode.fromList(Arrays.asList(1,2,3,4))).toList());
        Assert.assertEquals(Arrays.asList(2), solution.deleteMiddle(ListNode.fromList(Arrays.asList(2,1))).toList());
        Assert.assertEquals(Arrays.asList(), solution.deleteMiddle(ListNode.fromList(Arrays.asList(1))).toList());
    }

    @Test
    public void deleteMiddleTest2() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(Arrays.asList(1,3,4,1,2,6), solution.deleteMiddle2(ListNode.fromList(Arrays.asList(1,3,4,7,1,2,6))).toList());
        Assert.assertEquals(Arrays.asList(1,2,4), solution.deleteMiddle2(ListNode.fromList(Arrays.asList(1,2,3,4))).toList());
        Assert.assertEquals(Arrays.asList(2), solution.deleteMiddle2(ListNode.fromList(Arrays.asList(2,1))).toList());
        Assert.assertEquals(Arrays.asList(), solution.deleteMiddle2(ListNode.fromList(Arrays.asList(1))).toList());
    }
}
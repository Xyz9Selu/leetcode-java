package com.leetcode.m2130_pair_sum;

import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;


public class SolutionTest {
    @Test
    public void pairSumTest() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.pairSum(ListNode.fromList(Arrays.asList(5,4,2,1))));
        Assert.assertEquals(7, solution.pairSum(ListNode.fromList(Arrays.asList(4,2,2,3))));
        Assert.assertEquals(100001, solution.pairSum(ListNode.fromList(Arrays.asList(1,100000))));
        Assert.assertEquals(182, solution.pairSum(ListNode.fromList(Arrays.asList(47,22,81,46,94,95,90,22,55,91,6,83,49,65,10,32,41,26,83,99,14,85,42,99,89,69,30,92,32,74,9,81,5,9))));
    }
}
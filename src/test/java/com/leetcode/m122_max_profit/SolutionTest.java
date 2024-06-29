package com.leetcode.m122_max_profit;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void maxProfitTest() {
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(4, solution.maxProfit(new int[]{1,2,3,4,5}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void maxProfitTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.maxProfit2(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(4, solution.maxProfit2(new int[]{1,2,3,4,5}));
        Assert.assertEquals(0, solution.maxProfit2(new int[]{7,6,4,3,1}));
    }
}
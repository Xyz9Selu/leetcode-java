package com.leetcode.m198_rob;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void robTest() {
        Solution solution = new Solution();

        Assert.assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
        Assert.assertEquals(4, solution.rob(new int[]{2, 1, 1, 2}));
    }
}
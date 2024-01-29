package com.leetcode.m1004_longest_ones;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void longestOnesTest() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        Assert.assertEquals(10, solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}
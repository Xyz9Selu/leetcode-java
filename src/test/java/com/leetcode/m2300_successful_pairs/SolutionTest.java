package com.leetcode.m2300_successful_pairs;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void successfulPairsTest() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{4,0,3}, solution.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7));
        Assert.assertArrayEquals(new int[]{2,0,2}, solution.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16));
    }
}
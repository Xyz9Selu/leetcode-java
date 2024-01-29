package com.leetcode.m1493_longest_subarray;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void longestSubarrayTest() {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.longestSubarray(new int[]{1,1,0,1}));
        Assert.assertEquals(5, solution.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        Assert.assertEquals(2, solution.longestSubarray(new int[]{1,1,1}));
    }
}

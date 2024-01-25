package com.leetcode.m334_increasing_triplet;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testIncreasingTriplet() {
        Solution solution = new Solution();
        Assert.assertEquals(true, solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(false, solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        Assert.assertEquals(true, solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}
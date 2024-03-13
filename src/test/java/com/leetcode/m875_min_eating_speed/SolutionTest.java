package com.leetcode.m875_min_eating_speed;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        Assert.assertEquals(30, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        Assert.assertEquals(23, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }
}

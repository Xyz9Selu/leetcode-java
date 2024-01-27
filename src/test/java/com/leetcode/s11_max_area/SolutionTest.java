package com.leetcode.s11_max_area;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void maxAreaTest() {
        Solution solution = new Solution();

        Assert.assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(1, solution.maxArea(new int[]{1, 1}));
        Assert.assertEquals(16, solution.maxArea(new int[]{4, 3, 2, 1, 4}));
        Assert.assertEquals(2, solution.maxArea(new int[]{1, 2, 1}));
        Assert.assertEquals(24, solution.maxArea(new int[]{1, 3, 2, 5, 25, 24, 5}));
    }
}

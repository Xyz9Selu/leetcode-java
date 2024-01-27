package com.leetcode.s643_find_max_average;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void findMaxAverageTest() {
        Solution solution = new Solution();
        Assert.assertEquals(12.75, solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 0.00001);
        Assert.assertEquals(5.0, solution.findMaxAverage(new int[]{5}, 1), 0.00001);
    }
}
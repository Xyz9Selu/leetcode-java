package com.leetcode.s724_pivot_index;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void pivotIndexTest() {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Assert.assertEquals(-1, solution.pivotIndex(new int[]{1, 2, 3}));
        Assert.assertEquals(0, solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
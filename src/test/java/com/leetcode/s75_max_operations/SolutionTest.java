package com.leetcode.s75_max_operations;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void maxOperationsTest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.maxOperations(new int[]{1, 2, 3, 4}, 5));
        Assert.assertEquals(1, solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        Assert.assertEquals(3, solution.maxOperations(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, 3));
    }
}
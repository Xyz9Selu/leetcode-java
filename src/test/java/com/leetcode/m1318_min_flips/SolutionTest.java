package com.leetcode.m1318_min_flips;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void minFlipsTest() {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.minFlips(8, 3, 5));
        Assert.assertEquals(3, solution.minFlips(2, 6, 5));
        Assert.assertEquals(1, solution.minFlips(4, 2, 7));
        Assert.assertEquals(0, solution.minFlips(1, 2, 3));
    }
}

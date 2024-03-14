package com.leetcode.s1137_tribonacci;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testTribonacci() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.tribonacci(4));
        Assert.assertEquals(1389537, solution.tribonacci(25));
    }
}
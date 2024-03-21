package com.leetcode.s338_count_bits;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countBitsTest() {
        Solution solution = new Solution();

        Assert.assertArrayEquals(new int[]{0,1,1}, solution.countBits(2));
        Assert.assertArrayEquals(new int[]{0,1,1,2,1,2}, solution.countBits(5));
    }
}
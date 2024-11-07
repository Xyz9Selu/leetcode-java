package com.leetcode.m238_product_except_self;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testProductExceptSelf() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    public void testProductExceptSelf2() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf2(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf2(new int[]{-1, 1, 0, -3, 3}));
    }
}
package com.leetcode.s605_can_place_flowers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCanPlaceFlowers() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        Assert.assertFalse(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}
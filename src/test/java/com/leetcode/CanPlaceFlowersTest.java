package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CanPlaceFlowersTest {
    @Test
    public void test() {
        CanPlaceFlowers solution = new CanPlaceFlowers();
        Assert.assertTrue(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        Assert.assertFalse(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}
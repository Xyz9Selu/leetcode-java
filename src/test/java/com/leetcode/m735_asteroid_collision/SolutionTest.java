package com.leetcode.m735_asteroid_collision;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void asteroidCollisionTest() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{5,10}, solution.asteroidCollision(new int[]{5,10,-5}));
        Assert.assertArrayEquals(new int[]{}, solution.asteroidCollision(new int[]{8,-8}));
        Assert.assertArrayEquals(new int[]{10}, solution.asteroidCollision(new int[]{10,2,-5}));
    }

    @Test
    public void asteroidCollisionTest2() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{5,10}, solution.asteroidCollision2(new int[]{5,10,-5}));
        Assert.assertArrayEquals(new int[]{}, solution.asteroidCollision2(new int[]{8,-8}));
        Assert.assertArrayEquals(new int[]{10}, solution.asteroidCollision2(new int[]{10,2,-5}));
    }
}

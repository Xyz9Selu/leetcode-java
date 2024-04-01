package com.leetcode.m739_daily_temperatures;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void dailyTemperaturesTest() {
        Solution solution = new Solution();

        Assert.assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, solution.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
        Assert.assertArrayEquals(new int[]{1,1,1,0}, solution.dailyTemperatures(new int[]{30,40,50,60}));
        Assert.assertArrayEquals(new int[]{1,1,0}, solution.dailyTemperatures(new int[]{30,60,90}));
    }
}
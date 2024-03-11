package com.leetcode.m162_find_peak_element;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void findPeakElementTest() {
        Solution solution = new Solution();
        Assert.assertTrue(Arrays.asList(2).contains(solution.findPeakElement(new int[]{1,2,3,1})));
        Assert.assertTrue(Arrays.asList(1,5).contains(solution.findPeakElement(new int[]{1,2,1,3,5,6,4})));
    }

    @Test
    public void findPeakElementTest2() {
        Solution solution = new Solution();
        Assert.assertTrue(Arrays.asList(2).contains(solution.findPeakElement2(new int[]{1,2,3,1})));
        Assert.assertTrue(Arrays.asList(1,5).contains(solution.findPeakElement2(new int[]{1,2,1,3,5,6,4})));
    }
}
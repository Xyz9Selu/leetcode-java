package com.leetcode.m216_combination_sum3;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void combinationSum3Test() {
        Solution solution = new Solution();
        
        Assert.assertEquals(Arrays.asList(Arrays.asList(1,2,4)), solution.combinationSum3(3, 7));
        Assert.assertEquals(Arrays.asList(Arrays.asList(1,2,6), Arrays.asList(1,3,5), Arrays.asList(2,3,4)), solution.combinationSum3(3, 9));
        Assert.assertEquals(Arrays.asList(), solution.combinationSum3(4, 1));
    }
}
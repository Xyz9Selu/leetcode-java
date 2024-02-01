package com.leetcode.m2352_equal_pairs;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void equalPairsTest() {
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
        Assert.assertEquals(3, solution.equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
}
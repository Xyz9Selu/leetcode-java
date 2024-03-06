package com.leetcode.m2542_max_score;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void maxScoreTest() {
        Solution solution = new Solution();
        Assert.assertEquals(12, solution.maxScore(new int[]{1,3,3,2}, new int[]{2,1,3,4}, 3));
        Assert.assertEquals(30, solution.maxScore(new int[]{4,2,3,1,1}, new int[]{7,5,10,9,6}, 1));
    }
}
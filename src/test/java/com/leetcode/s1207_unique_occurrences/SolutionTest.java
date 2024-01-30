package com.leetcode.s1207_unique_occurrences;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void uniqueOccurrencesTest() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        Assert.assertFalse(solution.uniqueOccurrences(new int[]{1,2}));
        Assert.assertTrue(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
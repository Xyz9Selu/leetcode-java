package com.leetcode.s392_is_subsequence;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void isSubsequenceTest() {
        Solution solution = new Solution();

        Assert.assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        Assert.assertFalse(solution.isSubsequence("axc", "ahbgdc"));
        Assert.assertTrue(solution.isSubsequence("", "ahbgdc"));
        Assert.assertTrue(solution.isSubsequence("", ""));
        Assert.assertTrue(solution.isSubsequence("abc", "abc"));
        Assert.assertTrue(solution.isSubsequence("abc", "ababc"));
    }
}
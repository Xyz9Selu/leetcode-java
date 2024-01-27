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
        Assert.assertTrue(solution.isSubsequence("abc", "abababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "ababababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "abababababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "ababababababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "abababababababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "ababababababababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "abababababababababc"));
        Assert.assertTrue(solution.isSubsequence("abc", "ababababababababababc"));
    }
}
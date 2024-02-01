package com.leetcode.m1657_close_strings;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void closeStringsTest() {
        Solution solution = new Solution();

        Assert.assertTrue(solution.closeStrings("abc", "bca"));
        Assert.assertFalse(solution.closeStrings("a", "aa"));
        Assert.assertTrue(solution.closeStrings("cabbba", "abbccc"));
        Assert.assertFalse(solution.closeStrings("cabbba", "aabbss"));
        Assert.assertFalse(solution.closeStrings("uau", "ssx"));
        Assert.assertFalse(solution.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));
    }
}

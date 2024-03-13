package com.leetcode.m17_letter_combinations;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, solution.letterCombinations("23").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {}, solution.letterCombinations("").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {"a", "b", "c"}, solution.letterCombinations("2").toArray(new String[0]));
    }
}


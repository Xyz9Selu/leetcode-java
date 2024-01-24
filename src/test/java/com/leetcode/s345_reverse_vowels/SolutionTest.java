package com.leetcode.s345_reverse_vowels;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testReverseVowels() {
        Solution solution = new Solution();
        Assert.assertEquals("holle", solution.reverseVowels("hello"));
        Assert.assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}
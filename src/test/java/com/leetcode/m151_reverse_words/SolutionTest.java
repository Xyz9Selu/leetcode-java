package com.leetcode.m151_reverse_words;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testReverseWords() {
        Solution solution = new Solution();
        Assert.assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
        Assert.assertEquals("world! hello", solution.reverseWords("hello world!  "));
        Assert.assertEquals("example good a", solution.reverseWords("a good   example"));
    }

}
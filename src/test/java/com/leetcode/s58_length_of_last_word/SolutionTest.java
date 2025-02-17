package com.leetcode.s58_length_of_last_word;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void lengthOfLastWordTest() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
        Assert.assertEquals(1, solution.lengthOfLastWord("a"));
    }
}
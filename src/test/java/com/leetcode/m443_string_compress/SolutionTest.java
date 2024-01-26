package com.leetcode.m443_string_compress;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testCompress() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.compress(new char[]{'a', 'b', 'c'}));
        Assert.assertEquals(6, solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        Assert.assertEquals(1, solution.compress(new char[]{'a'}));
        Assert.assertEquals(4, solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
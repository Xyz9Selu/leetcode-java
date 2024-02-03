package com.leetcode.m394_decode_string;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void decodeStringTest() {
        Solution solution = new Solution();
        Assert.assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
        Assert.assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
        Assert.assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
        Assert.assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
        Assert.assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", solution.decodeString("100[leetcode]"));
    }

    @Test
    public void decodeStringTest2() {
        Solution solution = new Solution();
        Assert.assertEquals("aaabcbc", solution.decodeString2("3[a]2[bc]"));
        Assert.assertEquals("accaccacc", solution.decodeString2("3[a2[c]]"));
        Assert.assertEquals("abcabccdcdcdef", solution.decodeString2("2[abc]3[cd]ef"));
        Assert.assertEquals("abccdcdcdxyz", solution.decodeString2("abc3[cd]xyz"));
    }
}
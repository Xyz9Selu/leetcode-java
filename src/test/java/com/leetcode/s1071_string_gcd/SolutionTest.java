package com.leetcode.s1071_string_gcd;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void testStringGCD() {
        Solution solution = new Solution();

        Assert.assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
        Assert.assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
        Assert.assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }
}
package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class StringGCDTest {

    @Test
    public void testStringGCD() {
        StringGCD solution = new StringGCD();

        Assert.assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
        Assert.assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
        Assert.assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }
}
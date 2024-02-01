package com.leetcode.m2390_remove_stars;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void removeStarsTest() {
        Solution solution = new Solution();

        Assert.assertEquals("lecoe", solution.removeStars("leet**cod*e"));
        Assert.assertEquals("", solution.removeStars("erase*****"));
    }

    @Test
    public void removeStarsTest2() {
        Solution solution = new Solution();

        Assert.assertEquals("lecoe", solution.removeStars2("leet**cod*e"));
        Assert.assertEquals("", solution.removeStars2("erase*****"));
    }
}
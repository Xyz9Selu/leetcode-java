package com.leetcode.m435_erase_overlap_intervals;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void eraseOverlapIntervalsTest() {
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
        Assert.assertEquals(2, solution.eraseOverlapIntervals(new int[][]{{1,2}, {1,2}, {1,2}}));
        Assert.assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{1,2}, {2,3}}));
    }
}
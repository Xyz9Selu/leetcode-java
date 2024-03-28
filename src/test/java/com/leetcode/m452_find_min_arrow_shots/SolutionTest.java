package com.leetcode.m452_find_min_arrow_shots;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void findMinArrowShotsTest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.findMinArrowShots(new int[][]{{-2147483646,-2147483645},{2147483646,2147483647}}));
        Assert.assertEquals(2, solution.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
        Assert.assertEquals(4, solution.findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}));
        Assert.assertEquals(2, solution.findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}}));
    }
}
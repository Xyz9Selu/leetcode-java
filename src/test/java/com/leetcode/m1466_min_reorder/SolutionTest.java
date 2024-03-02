package com.leetcode.m1466_min_reorder;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void minReorderTest() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.minReorder(6, new int[][]{{0,1},{1,3},{2,3},{4,0},{4,5}}));
        Assert.assertEquals(2, solution.minReorder(5, new int[][]{{1,0},{1,2},{3,2},{3,4}}));
        Assert.assertEquals(0, solution.minReorder(3, new int[][]{{1,0},{2,0}}));
    }
}
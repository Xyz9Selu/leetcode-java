package com.leetcode.m994_oranges_rotting;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void orangesRottingTest() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
        Assert.assertEquals(-1, solution.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
        Assert.assertEquals(0, solution.orangesRotting(new int[][]{{0,2}}));
        Assert.assertEquals(2, solution.orangesRotting(new int[][]{{2,1,1},{1,1,1},{0,1,2}}));
    }
}
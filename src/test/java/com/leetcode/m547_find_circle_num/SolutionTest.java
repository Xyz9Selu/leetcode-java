package com.leetcode.m547_find_circle_num;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void findCircleNumTest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
        Assert.assertEquals(3, solution.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
    }
}
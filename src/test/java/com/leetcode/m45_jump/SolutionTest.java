package com.leetcode.m45_jump;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void jumpTest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.jump(new int[]{2,3,1,1,4}));
        Assert.assertEquals(2, solution.jump(new int[]{2,3,0,1,4}));
    }
}
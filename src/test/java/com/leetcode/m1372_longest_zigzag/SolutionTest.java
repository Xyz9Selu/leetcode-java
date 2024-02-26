package com.leetcode.m1372_longest_zigzag;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void longestZigZagTest() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.longestZigZag(TreeNode.fromList(Arrays.asList(1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1))));
        Assert.assertEquals(4, solution.longestZigZag(TreeNode.fromList(Arrays.asList(1,1,1,null,1,null,null,1,1,null,1))));
        Assert.assertEquals(0, solution.longestZigZag(TreeNode.fromList(Arrays.asList(1))));
    }
}
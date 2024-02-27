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
        Assert.assertEquals(5, solution.longestZigZag(TreeNode.fromList(Arrays.asList(6,9,7,3,null,2,8,5,8,9,7,3,9,9,4,2,10,null,5,4,3,10,10,9,4,1,2,null,null,6,5,null,null,null,null,9,null,9,6,5,null,5,null,null,7,7,4,null,1,null,null,3,7,null,9,null,null,null,null,null,null,null,null,9,9,null,null,null,7,null,null,null,null,null,null,null,null,null,6,8,7,null,null,null,3,10,null,null,null,null,null,1,null,1,2))));
    }

    @Test
    public void longestZigZagTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.longestZigZagWrong(TreeNode.fromList(Arrays.asList(1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1))));
        Assert.assertEquals(4, solution.longestZigZagWrong(TreeNode.fromList(Arrays.asList(1,1,1,null,1,null,null,1,1,null,1))));
        Assert.assertEquals(0, solution.longestZigZagWrong(TreeNode.fromList(Arrays.asList(1))));
        Assert.assertEquals(5, solution.longestZigZagWrong(TreeNode.fromList(Arrays.asList(6,9,7,3,null,2,8,5,8,9,7,3,9,9,4,2,10,null,5,4,3,10,10,9,4,1,2,null,null,6,5,null,null,null,null,9,null,9,6,5,null,5,null,null,7,7,4,null,1,null,null,3,7,null,9,null,null,null,null,null,null,null,null,9,9,null,null,null,7,null,null,null,null,null,null,null,null,null,6,8,7,null,null,null,3,10,null,null,null,null,null,1,null,1,2))));
    }
}

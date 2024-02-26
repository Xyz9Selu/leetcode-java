package com.leetcode.m437_path_sum;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void pathSumTest() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.pathSum(TreeNode.fromList(Arrays.asList(10,5,-3,3,2,null,11,3,-2,null,1)), 8));
        Assert.assertEquals(3, solution.pathSum(TreeNode.fromList(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1)), 22));
        Assert.assertEquals(0, solution.pathSum(TreeNode.fromList(Arrays.asList(1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000)), 0));
    }

    @Test
    public void pathSumTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.pathSum2(TreeNode.fromList(Arrays.asList(10,5,-3,3,2,null,11,3,-2,null,1)), 8));
        Assert.assertEquals(3, solution.pathSum2(TreeNode.fromList(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1)), 22));
        Assert.assertEquals(0, solution.pathSum2(TreeNode.fromList(Arrays.asList(1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000)), 0));
    }
}
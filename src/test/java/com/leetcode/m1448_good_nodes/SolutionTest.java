package com.leetcode.m1448_good_nodes;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void goodNodesTest() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.goodNodes(TreeNode.fromList(Arrays.asList(3,1,4,3,null,1,5))));
        Assert.assertEquals(3, solution.goodNodes(TreeNode.fromList(Arrays.asList(3,3,null,4,2))));
        Assert.assertEquals(1, solution.goodNodes(TreeNode.fromList(Arrays.asList(1))));
    }
}
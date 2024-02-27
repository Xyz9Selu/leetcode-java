package com.leetcode.m236_lowest_common_ancestor;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void lowestCommonAncestorTest() {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.lowestCommonAncestor(
            TreeNode.fromList(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4)), new TreeNode(5), new TreeNode(1)).val);
        Assert.assertEquals(5, solution.lowestCommonAncestor(
            TreeNode.fromList(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4)), new TreeNode(5), new TreeNode(4)).val);
        Assert.assertEquals(1, solution.lowestCommonAncestor(
            TreeNode.fromList(Arrays.asList(1,2)), new TreeNode(1), new TreeNode(2)).val);
    }
}
package com.leetcode.s104_max_depth;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {

    @Test
    public void maxDepthTest() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.maxDepth(TreeNode.fromList(Arrays.asList(3,9,20,null,null,15,7))));
        Assert.assertEquals(2, solution.maxDepth(TreeNode.fromList(Arrays.asList(1,null,2))));
    }
}
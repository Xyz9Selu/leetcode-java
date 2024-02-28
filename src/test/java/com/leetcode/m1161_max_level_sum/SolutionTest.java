package com.leetcode.m1161_max_level_sum;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void maxLevelSumTest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.maxLevelSum(TreeNode.fromList(Arrays.asList(1,7,0,7,-8,null,null))));
        Assert.assertEquals(2, solution.maxLevelSum(TreeNode.fromList(Arrays.asList(989,null,10250,98693,-89388,null,null,null,-32127))));
        Assert.assertEquals(3, solution.maxLevelSum(TreeNode.fromList(Arrays.asList(-100,-200,-300,-20,-5,-10,null))));
    }
    @Test
    public void maxLevelSumTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.maxLevelSum2(TreeNode.fromList(Arrays.asList(1,7,0,7,-8,null,null))));
        Assert.assertEquals(2, solution.maxLevelSum2(TreeNode.fromList(Arrays.asList(989,null,10250,98693,-89388,null,null,null,-32127))));
        Assert.assertEquals(3, solution.maxLevelSum2(TreeNode.fromList(Arrays.asList(-100,-200,-300,-20,-5,-10,null))));
    }
}
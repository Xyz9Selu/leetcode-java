package com.leetcode.m199_right_side_view;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void rightSideViewTest() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(1,3,4), solution.rightSideView(TreeNode.fromList(Arrays.asList(1,2,3,null,5,null,4))));
        Assert.assertEquals(Arrays.asList(1,3), solution.rightSideView(TreeNode.fromList(Arrays.asList(1,null,3))));
        Assert.assertEquals(Arrays.asList(), solution.rightSideView(TreeNode.fromList(Arrays.asList())));
    }
    @Test
    public void rightSideViewTest2() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(1,3,4), solution.rightSideView2(TreeNode.fromList(Arrays.asList(1,2,3,null,5,null,4))));
        Assert.assertEquals(Arrays.asList(1,3), solution.rightSideView2(TreeNode.fromList(Arrays.asList(1,null,3))));
        Assert.assertEquals(Arrays.asList(), solution.rightSideView2(TreeNode.fromList(Arrays.asList())));
    }
}
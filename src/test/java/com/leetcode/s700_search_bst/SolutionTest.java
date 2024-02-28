package com.leetcode.s700_search_bst;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void searchBSTTest() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(2,1,3), TreeNode.toList(solution.searchBST(TreeNode.fromList(Arrays.asList(4,2,7,1,3)), 2)));
        Assert.assertEquals(Arrays.asList(), TreeNode.toList(solution.searchBST(TreeNode.fromList(Arrays.asList(4,2,7,1,3)), 5)));
    }
}
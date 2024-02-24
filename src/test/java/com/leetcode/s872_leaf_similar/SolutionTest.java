package com.leetcode.s872_leaf_similar;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void leafSimilarTest() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.leafSimilar(
            TreeNode.fromList(Arrays.asList(3,5,1,6,2,9,8,null,null,7,4)), 
            TreeNode.fromList(Arrays.asList(3,5,1,6,7,4,2,null,null,null,null,null,null,9,8))));
        Assert.assertFalse(solution.leafSimilar(
            TreeNode.fromList(Arrays.asList(1,2,3)), 
            TreeNode.fromList(Arrays.asList(1,3,2))));
    }
}
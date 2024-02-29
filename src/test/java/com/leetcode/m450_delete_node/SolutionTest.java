package com.leetcode.m450_delete_node;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void deleteNode() {
        
        Solution solution = new Solution();
        Assert.assertEquals(new HashSet<>(Arrays.asList(5,2,6,null,4,null,7)), new HashSet<>(TreeNode.toList(solution.deleteNode(TreeNode.fromList(Arrays.asList(5,3,6,2,4,null,7)), 3))));
        Assert.assertEquals(new HashSet<>(Arrays.asList(5,3,6,2,4,null,7)), new HashSet<>(TreeNode.toList(solution.deleteNode(TreeNode.fromList(Arrays.asList(5,3,6,2,4,null,7)), 0))));
        Assert.assertEquals(new HashSet<>(Arrays.asList()), new HashSet<>(TreeNode.toList(solution.deleteNode(TreeNode.fromList(Arrays.asList()), 0))));
        Assert.assertEquals(new HashSet<>(Arrays.asList(4, 3, 6, 2, null, null, 7)), new HashSet<>(TreeNode.toList(solution.deleteNode(TreeNode.fromList(Arrays.asList(5,3,6,2,4,null,7)), 5))));
        Assert.assertEquals(new HashSet<>(Arrays.asList(4,null,8,6,9,5)), new HashSet<>(TreeNode.toList(solution.deleteNode(TreeNode.fromList(Arrays.asList(4,null,7,6,8,5,null,null,9)), 7))));
    }

    @Test
    public void deleteNode2() {
        Solution solution = new Solution();
        Assert.assertEquals(new HashSet<>(Arrays.asList(5,2,6,null,4,null,7)), new HashSet<>(TreeNode.toList(solution.deleteNode2(TreeNode.fromList(Arrays.asList(5,3,6,2,4,null,7)), 3))));
        Assert.assertEquals(new HashSet<>(Arrays.asList(5,3,6,2,4,null,7)), new HashSet<>(TreeNode.toList(solution.deleteNode2(TreeNode.fromList(Arrays.asList(5,3,6,2,4,null,7)), 0))));
        Assert.assertEquals(new HashSet<>(Arrays.asList()), new HashSet<>(TreeNode.toList(solution.deleteNode2(TreeNode.fromList(Arrays.asList()), 0))));
        Assert.assertEquals(new HashSet<>(Arrays.asList(6,3,7,2,4,null,null)), new HashSet<>(TreeNode.toList(solution.deleteNode2(TreeNode.fromList(Arrays.asList(5,3,6,2,4,null,7)), 5))));
    }
}

package com.leetcode.m437_path_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }

        return pathSumFromNode(root, targetSum) 
                + pathSum(root.left, targetSum) 
                + pathSum(root.right, targetSum);
    }

    private int pathSumFromNode(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }

        return (root.val == targetSum? 1: 0) 
                + pathSumFromNode(root.left, targetSum - root.val) 
                + pathSumFromNode(root.right, targetSum - root.val);
    }

    public int pathSum2(TreeNode root, long targetSum) {
        Map<Long, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0L, 1);

        return pathSumByPrefixSum(root, targetSum, 0, prefixSum);
    }

    private int pathSumByPrefixSum(TreeNode root, long targetSum, long sum, Map<Long, Integer> prefixSum) {
        if (root == null) {
            return 0;
        }

        Long currentSum = sum + root.val;
        int pathSum = prefixSum.getOrDefault(currentSum - targetSum, 0);

        prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);

        pathSum += pathSumByPrefixSum(root.left, targetSum, currentSum, prefixSum);
        pathSum += pathSumByPrefixSum(root.right, targetSum, currentSum, prefixSum);

        prefixSum.put(currentSum, prefixSum.get(currentSum) - 1);
        
        return pathSum;
    }
}
package com.leetcode.m1161_max_level_sum;

import java.util.LinkedList;
import java.util.Queue;

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
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int minLevel = 0;
        int maxSum = Integer.MIN_VALUE;

        while(!queue.isEmpty()) {
            int leveCount = queue.size();
            int sum = 0;
            for (int i = 0; i < leveCount; i ++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                minLevel = level;
            }

            level ++;
        }

        return minLevel;
    }

    public int maxLevelSum2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] sums = new int[100];
        int maxLevel = dfs(root, 0, sums);

        int maxSum = Integer.MIN_VALUE;
        int minLevel = 0;

        for (int i = 0; i < maxLevel; i ++) {
            if (sums[i] > maxSum) {
                minLevel = i;
                maxSum = sums[i];
            }
        }

        return minLevel + 1;
    }

    private int dfs(TreeNode root, int level, int[] sums) {
        if (root == null) {
            return level;
        }
        
        sums[level] += root.val;

        return Math.max(dfs(root.left, level + 1, sums), dfs(root.right, level + 1, sums));
    }
}
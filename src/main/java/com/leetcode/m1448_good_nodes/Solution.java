package com.leetcode.m1448_good_nodes;

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
    public int goodNodes(TreeNode root) {
        return findGoodNodes(root, Integer.MIN_VALUE);
    }

    private int findGoodNodes(TreeNode root, int maxVal) {
        if (root == null) {
            return 0;
        }

        int leftCount = findGoodNodes(root.left, Math.max(maxVal, root.val));
        int rightCount = findGoodNodes(root.right, Math.max(maxVal, root.val));

        return leftCount + rightCount + (root.val >= maxVal? 1: 0);
    }
}
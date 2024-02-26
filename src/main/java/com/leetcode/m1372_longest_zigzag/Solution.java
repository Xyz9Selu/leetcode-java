package com.leetcode.m1372_longest_zigzag;

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
    public int longestZigZag(TreeNode root) {
        return Math.max(
            longestZigZag(root.left, 0, true), 
            longestZigZag(root.right, 0, false));
    }

    private int longestZigZag(TreeNode root, int count, boolean left) {
        if (root == null) {
            return count;
        }

        return Math.max(
            longestZigZag(root.left, left? 0: count + 1, true), 
            longestZigZag(root.right, left? count + 1: 0, false));
    }
}
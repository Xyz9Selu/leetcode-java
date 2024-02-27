package com.leetcode.m236_lowest_common_ancestor;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // reach end
        if (root == null) {
            return null;
        }

        // find target
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // is common ancestor
        if (left != null && right != null) {
            return root;
        }

        // return found node
        return left != null? left: right;
    }
}
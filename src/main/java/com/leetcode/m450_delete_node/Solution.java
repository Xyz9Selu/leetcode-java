package com.leetcode.m450_delete_node;

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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // find next level
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // equals, remove root

            // at lease one side is null
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // both side is valid
            // find left's largest node, which has no right node
            // remove node from parent
            // set left node to node parent's right or left if is root
            TreeNode parent = root;
            TreeNode current = root.left;
            while(current.right != null) {
                parent = current;
                current = current.right;
            }

            root.val = current.val;
            if (parent == root) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }

        return root;
    }


    public TreeNode deleteNode2(TreeNode root, int key) {
        return travaseCreate(root, key, null);
    }

    private TreeNode travaseCreate(TreeNode root, int expect, TreeNode newRoot) {
        if (root == null) {
            return newRoot;
        }

        if (root.val != expect) {
            newRoot = addNode(newRoot, root.val);
        }

        newRoot = travaseCreate(root.left, expect, newRoot);
        newRoot = travaseCreate(root.right, expect, newRoot);

        return newRoot;
    }

    private TreeNode addNode(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (root.val > key) {
            if (root.left != null) {
                addNode(root.left, key);
            } else {
                root.left = new TreeNode(key);
            }
        } else {
            if (root.right != null) {
                addNode(root.right, key);
            } else {
                root.right = new TreeNode(key);
            }
        }

        return root;
    }
}
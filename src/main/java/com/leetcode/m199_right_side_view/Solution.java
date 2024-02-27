package com.leetcode.m199_right_side_view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<>();

        if(root == null) {
            return rightSideView;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i ++) {
                TreeNode currNode = queue.poll();
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }

                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }

                if (i == levelSize - 1) {
                    rightSideView.add(currNode.val);
                }
            }
        }

        return rightSideView;
    }

    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<>();

        rightSideView2(root, 0, rightSideView);

        return rightSideView;
    }

    private void rightSideView2(TreeNode root, int height, List<Integer> rightSideView) {
        if (root == null) {
            return;
        }

        int currHeight = height + 1;

        if (currHeight > rightSideView.size()) {
            rightSideView.add(root.val);
        }

        rightSideView2(root.right, currHeight, rightSideView);
        rightSideView2(root.left, currHeight, rightSideView);
    }
}
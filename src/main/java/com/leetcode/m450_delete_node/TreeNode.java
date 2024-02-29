package com.leetcode.m450_delete_node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode fromList(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }

        int index = 0;
        TreeNode root = new TreeNode(list.get(index++));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty() && index < list.size()) {
            TreeNode current = queue.poll();

            if (index < list.size() && list.get(index) != null) {
                current.left = new TreeNode(list.get(index));
                queue.offer(current.left);
            }
            index ++;
            
            if (index < list.size() && list.get(index) != null) {
                current.right = new TreeNode(list.get(index));
                queue.offer(current.right);
            }
            index ++;
        }

        return root;
    }

    public List<Integer> toList() {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        queue.offer(this);

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current != null) {
                list.add(current.val);
                queue.offer(current.left);
                queue.offer(current.right);
            } else {
                list.add(null);
                queue.offer(null);
                queue.offer(null);
            }
            
            // break if all pending nodes are null
            if (queue.stream().allMatch(Objects::isNull)) {
                break;
            }
        }

        return list;
    }

    public static List<Integer> toList(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        return root.toList();
    }
}

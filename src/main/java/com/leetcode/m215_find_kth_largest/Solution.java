package com.leetcode.m215_find_kth_largest;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickselect(nums, 0, n - 1, n - k);
    }

    int quickselect(int[] nums, int l, int r, int k) {
        if (l == r) {
            return nums[k];
        }

        int x = nums[l];
        int i = l - 1;
        int j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (nums[i] < x);
            do {
                j--;
            } while (nums[j] > x);
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        if (k <= j)
            return quickselect(nums, l, j, k);
        else
            return quickselect(nums, j + 1, r, k);
    }

    public int findKthLargest2(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(k);
        for (int i : nums) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
package com.leetcode.m2542_max_score;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        // pare nums1 and nums2
        int n = nums1.length;
        Integer[] ids = new Integer[n];
        for (int i = 0; i < n; i ++) {
            ids[i] = i;
        }

        // traverse pares by sort of nums2 desc
        Arrays.sort(ids, (a, b) -> Integer.compare(nums2[b], nums2[a]));

        long sum = 0;
        long ans = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int id: ids) {
            long num1 = nums1[id];
            long num2 = nums2[id];

            sum += num1;
            queue.offer(num1);

            // if exceed k, remove smallest num1 pair
            if (queue.size() > k) {
                sum -= queue.poll();
            }

            if (queue.size() == k) {
                // if reachs k, calculate score and recore max
                ans = Math.max(ans, sum * num2);
            }
        }

        return ans;
    }
}

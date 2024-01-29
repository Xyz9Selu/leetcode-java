package com.leetcode.m1004_longest_ones;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int maxCount = 0;

        for (right = 0; right < nums.length; right++) {
            // increase zero if meet
            if (nums[right] == 0) {
                zeroCount++;
            }

            // sirink left zero
            if (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount --;
                }
                left ++;
            }

            // including both end
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}
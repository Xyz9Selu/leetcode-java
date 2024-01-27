package com.leetcode.s643_find_max_average;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // fill window
        for (int i = 0; i < k; i ++) {
            sum += nums[i];
        }
        int max = sum;

        // slide window
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return (double)max / (double)k;
    }
}
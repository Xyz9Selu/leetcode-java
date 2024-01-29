package com.leetcode.s724_pivot_index;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int n: nums) {
            sum += n;
        }

        int lSum = 0;
        for (int i = 0; i < nums.length ; i ++) {
            if (lSum == sum - nums[i] - lSum) {
                return i;
            }

            lSum += nums[i];
        }

        return -1;
    }
}
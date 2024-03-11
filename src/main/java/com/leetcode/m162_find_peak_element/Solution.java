package com.leetcode.m162_find_peak_element;

public class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] < nums[i + 1]) {
                continue;
            } else {
                return i;
            }
        }

        return nums.length - 1;
    }

    public int findPeakElement2(int[] nums) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // peak is left
                r = mid;
            } else {
                // pead is mid or right
                l = mid + 1;
            }
        }

        return l;
    }
}

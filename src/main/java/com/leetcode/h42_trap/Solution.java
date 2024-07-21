package com.leetcode.h42_trap;

class Solution {
    public int trap(int[] height) {
        // double pointer
        // lower move until higher
        // exit when meet

        int left = 0;
        int right = height.length - 1;
        int amount = 0;
        int maxLeft = 0;
        int maxRight = 0;

        while (left < right) {
            maxLeft = Math.max(height[left], maxLeft);
            maxRight = Math.max(height[right], maxRight);
            int h = Math.min(maxLeft, maxRight);

            if (height[left] <= h) {
                amount += Math.max(h - height[left], 0);
                left ++;
            } else if (height[right] <= h) {
                amount += Math.max(h - height[right], 0);
                right --;
            }
        }

        return amount;
    }
}
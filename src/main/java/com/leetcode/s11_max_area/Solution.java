package com.leetcode.s11_max_area;

class Solution {
    public int maxArea(int[] height) {
        int li = 0;
        int ri = height.length - 1;
        int max = 0;

        while (li < ri) {
            int area = Math.min(height[li], height[ri]) * (ri - li);
            max = Math.max(max,area);

            if (height[li] < height[ri]) {
                li++;
            } else {
                ri--;
            }
        }

        return max;
    }
}
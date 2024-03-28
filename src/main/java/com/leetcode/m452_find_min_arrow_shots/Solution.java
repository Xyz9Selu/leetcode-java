package com.leetcode.m452_find_min_arrow_shots;

import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        int mod = 1_000_000_007;

        // sort by end pint
        Arrays.sort(points, (a, b) -> a[1] % mod - b[1] % mod);

        int end = points[0][1];
        int result = 1;

        for (int i = 1; i < points.length; i ++) {
            if (points[i][0] > end) {
                // shoot another arrow
                end = points[i][1];
                result ++;
            }
        }

        return result;
    }
}
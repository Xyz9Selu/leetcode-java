package com.leetcode.m435_erase_overlap_intervals;

import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return 0;
        }

        // sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];
        int result = 0;

        for (int i = 1; i < intervals.length; i ++) {
            int[] cur = intervals[i];
            if (cur[0] < end) {
                // overlaps, remove this
                result ++;
            } else {
                // not overlap, set to next smallest end
                end = cur[1];
            }
        }

        return result;
    }
}
package com.leetcode.m274_h_index;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int size = citations.length;

        int maxH = 0;
        for (int i = 0; i < citations.length; i ++) {
            if (citations[size - i - 1] >= i + 1) {
                maxH = Math.max(maxH, i + 1);
            } else {
                break;
            }
        }

        return maxH;
    }
}
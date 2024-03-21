package com.leetcode.s338_count_bits;

class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i ++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp;
    }
}
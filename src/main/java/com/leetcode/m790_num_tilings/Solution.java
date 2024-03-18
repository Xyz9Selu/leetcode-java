package com.leetcode.m790_num_tilings;

class Solution {
    public int numTilings(int n) {
        long mod = 1_000_000_007;
        long[] dp = new long[Math.max(n + 1, 3)];
        long[] dp2 = new long[Math.max(n + 1, 3)];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        dp2[0] = 0;
        dp2[1] = 0;
        dp2[2] = 1;

        for (int i = 3; i <= n; i ++) {
            dp2[i] = (dp2[i - 1] + dp[i - 2]) % mod;
            dp[i] = (dp[i - 1] + dp[i - 2] + dp2[i - 1] * 2) % mod;
        }

        return (int)dp[n];
    }
}
package com.leetcode.m1143_longest_common_subsequence;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        // init 0 col and 0 row to 0
        int[][] dp = new int[m + 1][n + 1];
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();

        for (int i = 1; i <= m; i ++) {
            for (int j = 1; j <= n; j ++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    // use last paire result to void multi match
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}
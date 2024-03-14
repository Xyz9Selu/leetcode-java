package com.leetcode.s1137_tribonacci;

class Solution {
    public int tribonacci(int n) {
        int[] buf = new int[n + 3];
        buf[0] = 0;
        buf[1] = 1;
        buf[2] = 1;

        for (int i = 3; i <= n; i ++) {
            buf[i] = buf[i - 3] + buf[i - 2] + buf[i - 1];
        }

        return buf[n];
    }
}
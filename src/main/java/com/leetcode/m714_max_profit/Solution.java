package com.leetcode.m714_max_profit;

class Solution {
    public int maxProfit(int[] prices, int fee) {
        // for init first buy
        int hold = Integer.MIN_VALUE;
        int notHold = 0;

        for (int p: prices) {
            hold = Math.max(
                hold, // keep hold
                notHold - p - fee); // buy
            notHold = Math.max(
                notHold, // keep not hold
                hold + p); // sell
        }

        return notHold;
    }
}

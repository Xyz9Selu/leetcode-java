package com.leetcode.s121_max_profit;

class Solution {
    public int maxProfit(int[] prices) {
        int bp = 0;
        int sp = 0;
        int profit = 0;

        while (sp <= prices.length - 1) {
            if (prices[sp] <= prices[bp]) {
                bp = sp;
            }

            profit = Math.max(profit, prices[sp] - prices[bp]);

            sp ++;
        }

        return profit;
    }
}
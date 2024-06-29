package com.leetcode.m122_max_profit;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int tmpProfit = 0;
        int bp = 0;
        int sp = 0;

        while (sp <= prices.length - 1) {
            if (prices[sp] <= prices[bp]) {
                bp = sp;
            } else {
                profit += prices[sp] - prices[bp];
            }

            tmpProfit = Math.max(tmpProfit, prices[sp] - prices[bp]);

            if (sp == prices.length - 1 || prices[sp + 1] < prices[sp]) {
                profit += tmpProfit;
                tmpProfit = 0;
                bp = sp;
            }

            sp ++;
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int profit = 0;
        for (int i = 1; i < prices.length; i ++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }

        return profit;
    }

}
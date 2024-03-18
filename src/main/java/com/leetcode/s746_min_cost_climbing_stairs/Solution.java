package com.leetcode.s746_min_cost_climbing_stairs;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] sp = new int[cost.length + 1];

        for (int i = 2; i <= cost.length; i ++) {
            System.out.println(String.format("i: %s from i-1: %s from i-2: %s", i, sp[i - 1] + cost[i - 1], sp[i - 2] + cost[i - 2]));
            sp[i] = Math.min(sp[i - 1] + cost[i - 1], sp[i - 2] + cost[i - 2]);
        }

        return sp[cost.length];
    }
}
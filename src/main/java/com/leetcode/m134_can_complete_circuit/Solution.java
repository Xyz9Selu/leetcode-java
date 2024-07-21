package com.leetcode.m134_can_complete_circuit;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start= 0;
        for (int i = 0; i < gas.length; i ++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i]; // topup and goto next gas station

            // invalid start, try next
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        // if gas is more than cost, always can complete
        return totalGas >= totalCost? start: -1;
    }
}
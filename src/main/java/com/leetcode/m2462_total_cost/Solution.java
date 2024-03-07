package com.leetcode.m2462_total_cost;

import java.util.PriorityQueue;
import java.util.Queue;


public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        long cost = 0;

        Queue<Integer> lQueue = new PriorityQueue<>();
        Queue<Integer> rQueue = new PriorityQueue<>();
        
        for(int hired = 0; hired < k; hired ++) {
            while (lQueue.size() < candidates && i <= j) {
                lQueue.offer(costs[i++]);
            }
            while (rQueue.size() < candidates && i <= j) {
                rQueue.offer(costs[j--]);
            }

            if (lQueue.isEmpty()) {
                // only left queue valid
                cost += rQueue.poll();
            } else if (rQueue.isEmpty()) {
                // only right queue valid
                cost += lQueue.poll();
            } else // both queue valid
            if (lQueue.peek() <= rQueue.peek()) {
                // pool from left queue
                cost += lQueue.poll();
            } else {
                // poll from right queue
                cost += rQueue.poll();
            }
        }

        return cost;
    }
}

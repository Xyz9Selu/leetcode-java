package com.leetcode.m875_min_eating_speed;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int left = 1;
        int right = maxPile;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;
            for (int p: piles) {
                time += (p + mid - 1) / mid;
            }

            if (time <= h) {
                // enough, mid is valid, try slower
                right = mid;
            } else {
                // not enough, mid is not valid , try faster
                left = mid + 1;
            }
        }

        return left;
    }
}
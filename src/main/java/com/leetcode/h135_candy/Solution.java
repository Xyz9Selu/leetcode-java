package com.leetcode.h135_candy;

class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];

        // init
        for (int i = 0; i < candies.length; i ++) {
            candies[i] = 1;
        }

        // from left to right, match right greater
        for (int i = 1; i < candies.length; i ++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // from right to left, match left greater
        for (int i = candies.length - 2; i >= 0; i --) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i + 1] + 1, candies[i]);
            }
        }

        int total = 0;
        for (int n: candies) {
            total += n;
        }

        return total;
    }
}
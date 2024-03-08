package com.leetcode.s374_guess_number;

public class Solution extends GuessGame {
    public Solution(int picked) {
        super(picked);
    }

    public int guessNumber(int n) {
        int min = 0;
        int max = n;
        while (min <= max) {
            int mid = min + (max - min) / 2;

            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res > 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }
}
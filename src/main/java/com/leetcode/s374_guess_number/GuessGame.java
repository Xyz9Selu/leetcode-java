package com.leetcode.s374_guess_number;

class GuessGame {
    int picked;

    public GuessGame(int picked) {
        this.picked = picked;
    }

    int guess(int num) {
        if (num == picked) return 0;
        return num > picked ? -1 : 1;
    }
}

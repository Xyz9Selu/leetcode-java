package com.leetcode.s283_move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int put = 0;

        // find first zero
        while (put < nums.length && nums[put] != 0) {
            put++;
        }

        // swap with first non-zero
        for (int i = put; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[put++] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
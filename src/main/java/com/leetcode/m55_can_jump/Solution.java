package com.leetcode.m55_can_jump;

class Solution {
    public boolean canJump(int[] nums) {
        // 每一点能跳到最远处
        int maxJump = 0;
        for(int i = 0; i < nums.length; i ++) {
            if (i > maxJump) {
                return false;
            }

            maxJump = Math.max(maxJump, i + nums[i]);

            if (maxJump >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
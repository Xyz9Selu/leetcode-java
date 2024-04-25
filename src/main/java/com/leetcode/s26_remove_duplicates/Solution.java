package com.leetcode.s26_remove_duplicates;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast ++) {
            if (nums[slow] != nums[fast]) {
                slow ++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
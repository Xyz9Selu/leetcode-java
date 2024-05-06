package com.leetcode.m88_remove_duplicates;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int fast = 2;
        int slow = 2;

        while(fast < nums.length) {
            if (nums[fast] > nums[slow - 2]) {
                nums[slow++] = nums[fast++];
            } else {
                fast ++;
            }
        }

        return slow;
    }
}
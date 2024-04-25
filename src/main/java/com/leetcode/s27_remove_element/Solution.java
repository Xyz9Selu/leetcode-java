package com.leetcode.s27_remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;

        while(fast < nums.length && slow < nums.length) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }

            fast++;
        }

        return slow;
    }
}
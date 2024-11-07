package com.leetcode.m238_product_except_self;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];
        int[] result = new int[nums.length];
        leftProducts[0] = 1;
        rightProducts[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;

        int prefix = 1;
        for (int i = 1; i < nums.length; i ++) {
            prefix *= nums[i - 1];
            ans[i] = prefix;
        }

        int suffix = 1;
        for (int i = nums.length - 2; i >= 0; i --) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }
}
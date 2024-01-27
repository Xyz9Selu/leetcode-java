package com.leetcode.s75_max_operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) { // 相等则找下一对
                left++;
                right--;
                operations++;
            } else if (sum < k) { // 小了加大
                left++;
            } else { // 大了减小
                right--;
            }
        }

        return operations;
    }


    // 用哈希表记录每个数字出现的次数，然后遍历数组，寻找和为 k 的配对
    public int maxOperations3(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int operations = 0;

        // 记录每个数字出现的次数
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 遍历数组，寻找和为 k 的配对
        for (int num : nums) {
            int complement = k - num;
            if (countMap.getOrDefault(num, 0) > 0 && countMap.getOrDefault(complement, 0) > 0) {
                // 如果当前数字和补数都存在，则减少计数
                if (num != complement || countMap.get(num) > 1) {
                    countMap.put(num, countMap.get(num) - 1);
                    countMap.put(complement, countMap.get(complement) - 1);
                    operations++;
                }
            }
        }

        return operations;
    }


    // 查找 & 交换
    public int maxOperations2(int[] nums, int k) {
        int i = 0;
        int count = 0;

        while (i < nums.length - 1) {
            int j = find(nums, i + 1, k - nums[i]);
            if (j != -1) {
                count++;
                swap(nums, i + 1, j);
                i++;
            }

            i++;
        }

        return count;
    }

    private int find(int[] nums, int start, int target) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) return;

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
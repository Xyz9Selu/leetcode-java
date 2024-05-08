package com.leetcode.s169_majority_element;

// 保证有超过一半数字
// 超过一半即为最大, 只要判断超过一半, 不用判断比其它更多
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int n: nums) {
            // count清零, 尝试选择下一候选者
            if (count == 0) {
                candidate = n;
            }

            // 与候选相同即 +1否则-1
            count += candidate == n? 1: -1;
        }

        return candidate;
    }
}
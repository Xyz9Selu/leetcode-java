package com.leetcode.m216_combination_sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Integer[] buf = new Integer[k];
        Arrays.fill(buf, 0);
        int[] status = new int[10];

        List<List<Integer>> result = new ArrayList<>();

        backtrace(status, 0, n, buf, result);

        return result;
    }

    private void backtrace(int[] status, int idx, int sum, Integer[] buf, List<List<Integer>> result) {
        if (idx == buf.length) {
            if (sum == 0) {
                result.add(Arrays.asList(Arrays.copyOf(buf, buf.length)));
            }

            return;
        }

        if (sum <= 0) {
            return;
        }

        for (int i = idx > 0? (buf[idx - 1] + 1): 1; i <= 9; i ++) {
            if (status[i] == 1) {
                continue;
            }

            status[i] = 1;
            buf[idx] = i;
            backtrace(status, idx + 1, sum - i, buf, result);
            status[i] = 0;
        }
    }
}
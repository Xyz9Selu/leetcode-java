package com.leetcode.m2352_equal_pairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private int intHash(int val) {
        long v = val;
        v *= 2654435761L;
        return (int)v >> 32;
    }

    public int equalPairs(int[][] grid) {
        Map<Integer, Integer> rowHashes = new HashMap<>();
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int hash = 1;
            for (int j = 0; j < grid[i].length; j++) {
                hash = hash * 127 + intHash(grid[i][j]);
            }
            rowHashes.put(hash, rowHashes.getOrDefault(hash, 0) + 1);
        }

        for (int j = 0; j < grid[0].length; j++) {
            int hash = 1;
            for (int i = 0; i < grid.length; i++) {
                hash = hash * 127 + intHash(grid[i][j]);
            }
            count += rowHashes.getOrDefault(hash, 0);
        }

        return count;
    }

}

package com.leetcode.s1207_unique_occurrences;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n: arr) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        Set<Integer> countSet = new HashSet<>();

        for (int c: countMap.values()) {
            if (!countSet.add(c)) {
                return false;
            }
        }
        
        return true;
    }
}

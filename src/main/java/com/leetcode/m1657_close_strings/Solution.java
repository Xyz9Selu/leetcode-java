package com.leetcode.m1657_close_strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> countMap1 = new HashMap<>();
        Map<Character, Integer> countMap2 = new HashMap<>();

        for (char c: word1.toCharArray()) {
            countMap1.put(c, countMap1.getOrDefault(c, 0) + 1);
        }
        
        for (char c: word2.toCharArray()) {
            countMap2.put(c, countMap2.getOrDefault(c, 0) + 1);
        }

        if (!countMap1.keySet().equals(countMap2.keySet())) {
            return false;
        }

        Integer[] counts1 = countMap1.values().toArray(new Integer[0]);
        Integer[] counts2 = countMap2.values().toArray(new Integer[0]);
        Arrays.sort(counts1);
        Arrays.sort(counts2);
        return Arrays.equals(counts1, counts2);
    }
}
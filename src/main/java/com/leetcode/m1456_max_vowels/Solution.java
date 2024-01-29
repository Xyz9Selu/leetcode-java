package com.leetcode.m1456_max_vowels;

class Solution {
    static final int[] vowels = new int[26];
    static {
        vowels['a' - 'a'] = 1;
        vowels['e' - 'a'] = 1;
        vowels['i' - 'a'] = 1;
        vowels['o' - 'a'] = 1;
        vowels['u' - 'a'] = 1;
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < k; i ++) {
            count += vowels[chars[i] - 'a'];
        }

        int max = count;

        for (int i = k; i < s.length(); i ++) {
            count += vowels[chars[i] - 'a'] - vowels[chars[i - k] - 'a'];
            max = Math.max(max, count);
        }

        return max;
    }
}
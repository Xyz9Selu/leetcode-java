package com.leetcode.s392_is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() < t.length()) {
            return false;
        }

        if (s.length() == t.length()) {
            return s.equals(t);
        }

        int is = 0;
        int it = 0;

        while (is < s.length() && it < t.length()) {
            if (s.charAt(is) == t.charAt(it)) {
                is++;
            }

            it++;
        }

        return is == s.length();
    }
}

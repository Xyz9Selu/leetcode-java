package com.leetcode.s1768_merge_alternately;

public class Solution {
    // This method is a placeholder for the solution to a LeetCode problem.
    public String mergeAlternately(String word1, String word2) {
        int wi1 = 0;
        int wi2 = 0;

        StringBuilder sb = new StringBuilder();

        while (wi1 < word1.length() || wi2 < word2.length()) {
            if (wi1 < word1.length()) {
                sb.append(word1.charAt(wi1));
                wi1++;
            }
            if (wi2 < word2.length()) {
                sb.append(word2.charAt(wi2));
                wi2++;
            }
        }

        return sb.toString();
    }

    public String fmergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        char[] ret = new char[len1 + len2];
        int i = 0, j = 0;
        for (int k = 0; i < len1 && j < len2;) {
            ret[k++] = s1[i++];
            ret[k++] = s2[j++];
        }
        if (i == len1) {
            for (int r = j; r < len2; r++) {
                ret[len1 + r] = s2[r];
            }
        } else {
            for (int r = i; r < len1; r++) {
                ret[len2 + r] = s1[r];
            }
        }
        String fin = String.copyValueOf(ret);
        return fin;
    }

}
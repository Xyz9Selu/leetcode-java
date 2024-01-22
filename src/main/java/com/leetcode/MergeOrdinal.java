package com.leetcode;

public class MergeOrdinal {
    // This method is a placeholder for the solution to a LeetCode problem.
    public String mergeAlternately(String word1, String word2) {
        int wi1 = 0;
        int wi2 = 0;

        StringBuilder sb = new StringBuilder();

        while(wi1 < word1.length() || wi2 < word2.length()) {
            int c1 = wi1 < word1.length()? word1.charAt(wi1): Integer.MAX_VALUE;
            int c2 = wi2 < word2.length()? word2.charAt(wi2): Integer.MAX_VALUE;
            
            if (c1 < c2) {
                sb.append(word1.charAt(wi1));
                wi1++;
            } else {
                if (c2 < Integer.MAX_VALUE) {
                    sb.append(word2.charAt(wi2));
                }
                wi2++;

            }
        } 

        return sb.toString();
    }
}
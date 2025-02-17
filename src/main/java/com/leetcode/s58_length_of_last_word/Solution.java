package com.leetcode.s58_length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        int wordEnd = s.length() - 1;
        while (s.charAt(wordEnd) == ' ') {
            wordEnd --;
        }

        int wordStart = wordEnd;
        while (wordStart >= 0 && s.charAt(wordStart) != ' ') {
            wordStart --;
        }

        return wordEnd - wordStart;
    }
}

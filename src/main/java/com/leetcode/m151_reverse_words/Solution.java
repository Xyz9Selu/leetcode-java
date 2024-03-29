package com.leetcode.m151_reverse_words;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\s");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i --) {
            if(words[i].length() > 0) {
                sb.append(words[i]).append(' ');
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
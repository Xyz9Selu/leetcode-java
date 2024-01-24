package com.leetcode.s345_reverse_vowels;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        int head = 0;
        int tail = s.length() - 1;
        char[] characters = s.toCharArray();

        while (head < tail) {
            while (!vowels.contains(characters[head]) && head < tail) {
                head++;
            }
            while (!vowels.contains(characters[tail]) && head < tail) {
                tail--;
            }
            
            if (head < tail) {
                char temp = characters[head];
                characters[head] = characters[tail];
                characters[tail] = temp;
                head++;
                tail--;
            }
        }

        return new String(characters);
    }
}

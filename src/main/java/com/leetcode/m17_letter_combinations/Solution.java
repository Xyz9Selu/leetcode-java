package com.leetcode.m17_letter_combinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static Map<Character, char[]> letterMap = new HashMap<>();
    static {
        letterMap.put('0', new char[]{});
        letterMap.put('1', new char[]{});
        letterMap.put('2', new char[]{'a', 'b', 'c'});
        letterMap.put('3', new char[]{'d', 'e', 'f'});
        letterMap.put('4', new char[]{'g', 'h', 'i'});
        letterMap.put('5', new char[]{'j', 'k', 'l'});
        letterMap.put('6', new char[]{'m', 'n', 'o'});
        letterMap.put('7', new char[]{'p', 'q', 'r', 's'});
        letterMap.put('8', new char[]{'t', 'u', 'v'});
        letterMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        char[] digitsChars = digits.toCharArray();
        char[] buf = new char[digits.length()];
        backtrack(digitsChars, 0, buf, combinations);

        return combinations;
    }

    private void backtrack(char[] digitsChars, int i, char[] buf, List<String> combinations) {
        if (i >= digitsChars.length) {
            combinations.add(new String(buf));
            return;
        }

        for (char c: letterMap.get(digitsChars[i])) {
            buf[i] = c;
            backtrack(digitsChars, i + 1, buf, combinations);
        }
    }
}
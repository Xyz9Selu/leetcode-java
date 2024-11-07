package com.leetcode.s13_roman_to_int;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // small after large: plus
        // small before large: minus

        Map<Character, Integer> romanCharacterMap = new HashMap<>();
        romanCharacterMap.put('I', 1);
        romanCharacterMap.put('V', 5);
        romanCharacterMap.put('X', 10);
        romanCharacterMap.put('L', 50);
        romanCharacterMap.put('C', 100);
        romanCharacterMap.put('D', 500);
        romanCharacterMap.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i ++) {
            int curVal = romanCharacterMap.get(s.charAt(i));
            // check if is minus
            if (i <= s.length() - 2 && curVal < romanCharacterMap.get(s.charAt(i + 1))) {
                ans -= curVal;
            } else {
                ans += curVal;
            }
        }

        return ans;
    }
}
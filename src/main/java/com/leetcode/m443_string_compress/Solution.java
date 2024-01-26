package com.leetcode.m443_string_compress;

public class Solution {
    public int compress(char[] chars) {
        int ir = 0;
        int iw = 0;
        while (ir < chars.length) {
            char cur = chars[ir];
            int count = 0;
            // read until different
            while (ir < chars.length && chars[ir] == cur) {
                count ++;
                ir ++;
            }
            chars[iw++] = cur;

            // write count if > 1
            if (count > 1) {
                for (char nc : String.valueOf(count).toCharArray()) {
                    chars[iw++] = nc;
                }
            }
        }

        return iw;
    }
}
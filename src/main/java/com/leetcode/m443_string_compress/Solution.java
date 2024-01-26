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
                int cnt = count;
                int st = iw;
                
                while (cnt > 0) {
                    chars[iw++] = (char) ('0' + cnt % 10);
                    cnt /= 10;
                }
                
                reverse(chars, st, iw - 1);
            }
        }

        return iw;
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = tmp;
        }
    }
}
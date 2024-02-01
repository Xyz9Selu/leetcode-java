package com.leetcode.m2390_remove_stars;

class Solution {
    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        int iTop = 0;

        for (int ir = 0; ir < chars.length; ir ++) {
            if (chars[ir] != '*') {
                chars[iTop++] = chars[ir];
            } else if (iTop > 0) {
                iTop --;
            }
        }

        return new String(chars, 0, iTop);
    }

    public String removeStars2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (ch == '*' && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

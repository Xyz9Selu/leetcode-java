package com.leetcode;

// 1071. Greatest Common Divisor of Strings
public class StringGCD {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    private boolean testGcdStr(String str, String gcdStr) {
        for (int i = 0; i < str.length(); i += gcdStr.length()) {
            if (!str.startsWith(gcdStr, i)) {
                return false;
            }
        }
        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        // get gcd
        int gcd = gcd(str1.length(), str2.length());
        // test strings
        String gcdStr = str2.substring(0, gcd);

        if (testGcdStr(str1, gcdStr) && testGcdStr(str2, gcdStr)) {
            return gcdStr;
        }

        return "";
    }

}

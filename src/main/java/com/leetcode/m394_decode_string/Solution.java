package com.leetcode.m394_decode_string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Deque <StringBuilder> strStack = new ArrayDeque<>();
        Deque<Integer> numberStack = new ArrayDeque<>();
        strStack.push(new StringBuilder());
        int number = 0;
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                number = number * 10 + (c - '0');
            } else if ('a' <= c && c <= 'z') {
                strStack.peek().append(c);
            } else if (c == '[') {
                // push string buffer and number
                strStack.push(new StringBuilder());
                numberStack.push(number);
                number = 0;
            } else if (c == ']') {
                String str = strStack.pop().toString();
                int repeat = numberStack.pop();
                for (int i = 0; i < repeat; i ++) {
                    strStack.peek().append(str);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb: strStack) {
            result.append(sb.toString());
        }

        return result.toString();
    }

    public String decodeString2(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == ']') {
                // read chars
                Character cur = null;
                Deque<Character> chars = new ArrayDeque<>();

                // pop chars
                while ((cur = st.pop()) != '[') {
                    if ('a' <= cur && cur <= 'z') {
                        chars.push(cur);
                    }
                }

                // pop numbers
                int numPos = 1;
                int number = 0;
                while (!st.isEmpty()) {
                    cur = st.peek();
                    if ('0' <= cur && cur <= '9') {
                        number += (cur - '0') * numPos;
                        st.pop();
                        numPos *= 10;
                    } else {
                        break;
                    }
                }

                for (int i = 0; i < number; i ++) {
                    for (char strChar: chars.reversed()) {
                        st.push(strChar);
                    }
                }
            } else {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.reversed());
        for (int i : st) {
            System.out.println(i);
        }
    }
}
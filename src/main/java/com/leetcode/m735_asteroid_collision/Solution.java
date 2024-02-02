package com.leetcode.m735_asteroid_collision;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int top = 0;
        for (int cur : asteroids) {
            // crash until ...
            while (cur < 0 && top > 0 && asteroids[top - 1] > 0) {
                int topVal = Math.abs(asteroids[top - 1]);
                int curVal = Math.abs(cur);

                if (topVal <= curVal) {
                    top --;
                }

                if (curVal <= topVal) {
                    cur = 0;
                }
            }

            // push if still alive
            if (cur != 0) {
                asteroids[top ++] = cur;
            }
        }

        return Arrays.copyOf(asteroids, top);
    }

    public int[] asteroidCollision2(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (Integer cur : asteroids) {
            // crash until ...
            while (cur != null && cur < 0 && !st.isEmpty() && st.peek() > 0) {
                int topVal = Math.abs(st.peek());
                int curVal = Math.abs(cur);

                if (topVal <= curVal) {
                    st.pop();
                }

                if (curVal <= topVal) {
                    cur = null;
                }
            }

            // push if still alive
            if (cur != null) {
                st.push(cur);
            }
        }

        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i ++) {
            result[i] = st.get(i);
        }
        return result;
    }
}

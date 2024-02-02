package com.leetcode.m735_asteroid_collision;

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i ++) {
            // crash until ...
            Integer cur = asteroids[i];
            while (cur != null && cur < 0 && !st.isEmpty() && st.peek() > 0) {
                int top = st.peek();

                if (cur + top <= 0) {
                    st.pop();
                }

                if (cur + top >= 0) {
                    cur = null;
                }
            }

            // push if not crashed
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

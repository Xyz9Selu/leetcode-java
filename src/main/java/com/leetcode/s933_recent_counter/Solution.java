package com.leetcode.s933_recent_counter;

import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.remove();
        }

        return queue.size();
    }
}


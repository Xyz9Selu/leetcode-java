package com.leetcode.m2336_smallest_infinite_set;

import java.util.HashSet;
import java.util.PriorityQueue;

public class SmallestInfiniteSet {
    PriorityQueue<Integer> queue;
    HashSet<Integer> set;
    int min;
    public SmallestInfiniteSet() {
        queue = new PriorityQueue<>();
        set = new HashSet<>();
        min = 1;
    }
    
    public int popSmallest() {
        int result = min;
        if (!queue.isEmpty()) {
            result = queue.poll();
            set.remove(result);
        } else {
            min ++;
        }

        return result;
    }
    
    public void addBack(int num) {
        if (num < min && !set.contains(num)) {
            queue.offer(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
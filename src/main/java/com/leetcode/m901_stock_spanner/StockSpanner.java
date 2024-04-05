package com.leetcode.m901_stock_spanner;

import java.util.Deque;
import java.util.LinkedList;

class StockSpanner {
    Deque<Integer[]> stack;
    public StockSpanner() {
        stack = new LinkedList<>();
    }
    
    public int next(int price) {
        int count = 1;
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            count += stack.pop()[1];
        }

        stack.push(new Integer[]{price, count});
        
        return count;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
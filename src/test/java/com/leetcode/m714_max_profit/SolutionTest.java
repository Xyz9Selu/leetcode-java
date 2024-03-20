package com.leetcode.m714_max_profit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        Solution solution = new Solution();
        assertEquals(8, solution.maxProfit(new int[]{1,3,2,8,4,9}, 2));
        assertEquals(6, solution.maxProfit(new int[]{1,3,7,5,10,3}, 3));
    }
}

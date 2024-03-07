package com.leetcode.m2462_total_cost;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testHireWorkers() {
        Solution solution = new Solution();
        assertEquals(11, solution.totalCost(new int[]{17,12,10,2,7,2,11,20,8}, 3, 4));
        assertEquals(4, solution.totalCost(new int[]{1,2,4,1}, 3, 3));
    }
}

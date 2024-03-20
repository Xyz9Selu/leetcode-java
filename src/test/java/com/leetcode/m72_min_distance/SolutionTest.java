package com.leetcode.m72_min_distance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void testMinDistance() {
        Solution solution = new Solution();
        
        assertEquals(3, solution.minDistance("horse", "ros"));
        assertEquals(5, solution.minDistance("intention", "execution"));   
    }
}

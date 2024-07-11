package com.leetcode.m274_h_index;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void hIndexTest() {
                Solution solution = new Solution();
        
        int[] citations1 = {3, 0, 6, 1, 5};
        assertEquals(3, solution.hIndex(citations1));
        
        int[] citations2 = {1, 3, 1};
        assertEquals(1, solution.hIndex(citations2));
        
        int[] citations3 = {0, 0, 0};
        assertEquals(0, solution.hIndex(citations3));
        
        int[] citations4 = {10, 8, 5, 4, 3};
        assertEquals(4, solution.hIndex(citations4));
        
        int[] citations5 = {25, 8, 5, 3, 3};
        assertEquals(3, solution.hIndex(citations5));
    }
}
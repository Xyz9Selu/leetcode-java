package com.leetcode.h135_candy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void testCandy() {
        Solution solution = new Solution();
        
        int[] ratings1 = {1, 0, 2};
        assertEquals(5, solution.candy(ratings1));
        
        int[] ratings2 = {1, 2, 2};
        assertEquals(4, solution.candy(ratings2));
        
        int[] ratings3 = {1, 3, 2, 2, 1};
        assertEquals(7, solution.candy(ratings3));
        
        int[] ratings4 = {1, 2, 87, 87, 87, 2, 1};
        assertEquals(13, solution.candy(ratings4));
        
        int[] ratings5 = {1, 3, 4, 5, 2};
        assertEquals(11, solution.candy(ratings5));
    }
}

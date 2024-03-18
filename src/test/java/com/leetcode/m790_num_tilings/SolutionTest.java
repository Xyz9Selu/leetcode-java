package com.leetcode.m790_num_tilings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void testNumTilings() {
        Solution solution = new Solution();
        // assertEquals(1, solution.numTilings(1));
        // assertEquals(2, solution.numTilings(2));
        // assertEquals(5, solution.numTilings(3));
        assertEquals(312342182, solution.numTilings(30));
    }
}

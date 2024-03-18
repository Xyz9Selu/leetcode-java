package com.leetcode.m62_unique_paths;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testUniquePaths() {
        Solution solution = new Solution();
        assertEquals(3, solution.uniquePaths(3, 2));
        assertEquals(28, solution.uniquePaths(7, 3));
    }
}

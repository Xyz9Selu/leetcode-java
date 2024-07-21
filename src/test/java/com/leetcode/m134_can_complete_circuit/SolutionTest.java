package com.leetcode.m134_can_complete_circuit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void testCanCompleteCircuit() {
        Solution solution = new Solution();
        
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        assertEquals(3, solution.canCompleteCircuit(gas1, cost1));
        
        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        assertEquals(-1, solution.canCompleteCircuit(gas2, cost2));
        
        int[] gas3 = {5, 1, 2, 3, 4};
        int[] cost3 = {4, 4, 1, 5, 1};
        assertEquals(4, solution.canCompleteCircuit(gas3, cost3));
        
        int[] gas4 = {2, 0, 1, 2, 3, 4, 0};
        int[] cost4 = {0, 1, 0, 0, 0, 0, 11};
        assertEquals(0, solution.canCompleteCircuit(gas4, cost4));
    }
}

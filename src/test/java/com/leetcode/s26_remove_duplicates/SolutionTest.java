package com.leetcode.s26_remove_duplicates;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();

        int[] nums = {1,1,2};
        int expectedLength = 2;
        int[] expectedResult = {1,2};

        int actualLength = solution.removeDuplicates(nums);
        int[] result = new int[actualLength];
        System.arraycopy(nums, 0, result, 0, actualLength);

        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedResult, result);
        
    }

    @Test
    public void testRemoveDuplicates2() {
        Solution solution = new Solution();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expectedLength = 5;
        int[] expectedResult = {0,1,2,3,4};

        int actualLength = solution.removeDuplicates(nums);
        int[] result = new int[actualLength];
        System.arraycopy(nums, 0, result, 0, actualLength);

        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedResult, result);
        
    }
}


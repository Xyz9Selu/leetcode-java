package com.leetcode.m55_can_jump;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void testCanJump() {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(nums1));
        
        int[] nums2 = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(nums2));
        
        int[] nums3 = {0};
        assertTrue(solution.canJump(nums3));
        
        int[] nums4 = {1, 2, 3};
        assertTrue(solution.canJump(nums4));
        
        int[] nums5 = {2, 0, 0};
        assertTrue(solution.canJump(nums5));
    }
}
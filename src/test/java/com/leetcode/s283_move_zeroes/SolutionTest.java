package com.leetcode.s283_move_zeroes;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testMoveZeroes() {
        Solution solution = new Solution();

        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

        nums = new int[]{0};
        solution.moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{0}, nums);
    }
}

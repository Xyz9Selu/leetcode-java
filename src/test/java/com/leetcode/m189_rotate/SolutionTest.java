package com.leetcode.m189_rotate;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void rotateTest() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        new Solution().rotate(nums, k);
        Assert.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
    }
    @Test
    public void rotateTest2() {
        int[] nums = {-1,-100,3,99};
        int k = 2;

        new Solution().rotate(nums, k);
        Assert.assertArrayEquals(new int[]{3,99,-1,-100}, nums);
    }
}
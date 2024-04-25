package com.leetcode.s88_merge;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void mergeTest() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        solution.merge(nums1, 3, new int[]{2,5,6}, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    public void mergeTest2() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1};
        solution.merge(nums1, 1, new int[]{}, 0);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void mergeTest3() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{0};
        solution.merge(nums1, 0, new int[]{1}, 1);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }

}
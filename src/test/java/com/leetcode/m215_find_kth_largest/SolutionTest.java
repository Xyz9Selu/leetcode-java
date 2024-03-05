package com.leetcode.m215_find_kth_largest;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void findKthLargestTest() {
        Solution solution = new Solution();

        Assert.assertEquals(5, solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        Assert.assertEquals(4, solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    @Test
    public void findKthLargestTest2() {
        Solution solution = new Solution();

        Assert.assertEquals(5, solution.findKthLargest2(new int[]{3,2,1,5,6,4}, 2));
        Assert.assertEquals(4, solution.findKthLargest2(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
package com.leetcode.m88_remove_duplicates;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void removeDuplicatesTest() {
        int[] nums = {1,1,1,2,2,3};
        int[] exp = {1,1,2,2,3};
        
        Solution solution = new Solution();

        int len = solution.removeDuplicates(nums);
        int[] act = new int[exp.length];

        System.arraycopy(nums, 0, act, 0, len);
        
        Assert.assertEquals(exp.length, len);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void removeDuplicatesTest2() {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int[] exp = {0,0,1,1,2,3,3};
        
        Solution solution = new Solution();

        int len = solution.removeDuplicates(nums);
        int[] act = new int[exp.length];

        System.arraycopy(nums, 0, act, 0, len);
        
        Assert.assertEquals(exp.length, len);
        Assert.assertArrayEquals(exp, act);
    }
}
package com.leetcode.s27_remove_element;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void removeElementTest() {
        Solution solution = new Solution();

        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int expLen = 2;
        int[] expResult = new int[]{2,2};

        int len = solution.removeElement(nums, val);
        int[] result = new int[len];
        System.arraycopy(nums, 0, result, 0, len);

        Assert.assertEquals(expLen, len);
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void removeElementTest2() {
        Solution solution = new Solution();

        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int expLen = 5;
        int[] expResult = new int[]{0,1,3,0,4};

        int len = solution.removeElement(nums, val);
        int[] result = new int[len];
        System.arraycopy(nums, 0, result, 0, len);

        Assert.assertEquals(expLen, len);
        Assert.assertArrayEquals(expResult, result);
    }
}
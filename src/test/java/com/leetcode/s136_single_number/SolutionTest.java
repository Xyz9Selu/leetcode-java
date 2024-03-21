package com.leetcode.s136_single_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void singleNumberTest() {
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.singleNumber(new int[]{2,2,1}));
        Assert.assertEquals(4, solution.singleNumber(new int[]{4,1,2,1,2}));
        Assert.assertEquals(1, solution.singleNumber(new int[]{1}));
    }
}
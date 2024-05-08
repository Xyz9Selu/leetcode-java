package com.leetcode.s169_majority_element;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void majorityElementTest() {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
        Assert.assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
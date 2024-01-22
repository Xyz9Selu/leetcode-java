package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testAdd() {
        Solution solution = new Solution();
        int sum = solution.add(2, 3);
        Assert.assertEquals(5, sum);
    }
}
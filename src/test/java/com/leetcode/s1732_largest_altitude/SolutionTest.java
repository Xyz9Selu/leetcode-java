package com.leetcode.s1732_largest_altitude;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void largestAltitude() {
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.largestAltitude(new int[]{-5,1,5,0,-7}));
        Assert.assertEquals(0, solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
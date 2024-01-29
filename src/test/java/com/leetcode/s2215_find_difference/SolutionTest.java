package com.leetcode.s2215_find_difference;

import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void findDifferenceTest() {
        Solution solution = new Solution();
        List<List<Integer>> result;

        result = solution.findDifference(new int[]{1,2,3}, new int[]{2,4,6});
        Assert.assertArrayEquals(new Integer[]{1,3}, result.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{4,6}, result.get(1).toArray());

        result = solution.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        Assert.assertArrayEquals(new Integer[]{3}, result.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{}, result.get(1).toArray());
    }

    @Test
    public void findDifferenceTest2() {
        Solution solution = new Solution();
        List<List<Integer>> result;

        result = solution.findDifference2(new int[]{1,2,3}, new int[]{2,4,6});
        Assert.assertArrayEquals(new Integer[]{1,3}, result.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{4,6}, result.get(1).toArray());

        result = solution.findDifference2(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        Assert.assertArrayEquals(new Integer[]{3}, result.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{}, result.get(1).toArray());
    }
}
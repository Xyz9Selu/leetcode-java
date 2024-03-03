package com.leetcode.m1926_nearest_exit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class SolutionTest {
    private <T> List<List<T>> toList(T[][] twoDArray) {
        List<List<T>> result = new ArrayList<>();
        for(T[] array: twoDArray) {
            result.add(Arrays.asList(array));
        }

        return result;
    }
    
    @Test
    public void nearestExitTest() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.nearestExit(new char[][]{{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}}, new int[]{1,2}));
        Assert.assertEquals(2, solution.nearestExit(new char[][]{{'+','+','+'},{'.','.','.'},{'+','+','+'}}, new int[]{1,0}));
        Assert.assertEquals(-1, solution.nearestExit(new char[][]{{'.','+'}}, new int[]{0,0}));
    }
}
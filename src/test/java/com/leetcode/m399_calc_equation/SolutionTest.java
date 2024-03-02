package com.leetcode.m399_calc_equation;

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
    public void calcEquationTest() {
        Solution solution = new Solution();

        Assert.assertArrayEquals(new double[]{6.00000,0.50000,-1.00000,1.00000,-1.00000}, solution.calcEquation(toList(new String[][]{{"a","b"},{"b","c"}}), new double[]{2.0,3.0}, toList(new String[][]{{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}})), 0.001);
        Assert.assertArrayEquals(new double[]{3.75000,0.40000,5.00000,0.20000}, solution.calcEquation(toList(new String[][]{{"a","b"},{"b","c"},{"bc","cd"}}), new double[]{1.5,2.5,5.0}, toList(new String[][]{{"a","c"},{"c","b"},{"bc","cd"},{"cd","bc"}})), 0.001);
        Assert.assertArrayEquals(new double[]{0.50000,2.00000,-1.00000,-1.00000}, solution.calcEquation(toList(new String[][]{{"a","b"}}), new double[]{0.5}, toList(new String[][]{{"a","b"},{"b","a"},{"a","c"},{"x","y"}})), 0.001);
    }
}
package com.leetcode.m1268_suggested_products;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SolutionTest {
    @Test
    public void suggestedProductsTest() {
        Solution solution = new Solution();

        Assert.assertEquals(Arrays.asList(
            Arrays.asList("mobile","moneypot","monitor"),
            Arrays.asList("mobile","moneypot","monitor"),
            Arrays.asList("mouse","mousepad"),
            Arrays.asList("mouse","mousepad"),
            Arrays.asList("mouse","mousepad")
        ), solution.suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse"));

        Assert.assertEquals(Arrays.asList(
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana")
        ), solution.suggestedProducts(new String[]{"havana"}, "havana"));

        Assert.assertEquals(Arrays.asList(
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList()
        ), solution.suggestedProducts(new String[]{"havana"}, "tatiana"));
    }
}
package com.leetcode.m901_stock_spanner;

import org.junit.Test;
import org.junit.Assert;

public class StockSpannerTest {
    @Test
    public void stockSpannerTest() {
        StockSpanner stockSpanner = new StockSpanner();
        Assert.assertEquals(1, stockSpanner.next(100));
        Assert.assertEquals(1, stockSpanner.next(80));
        Assert.assertEquals(1, stockSpanner.next(60));
        Assert.assertEquals(2, stockSpanner.next(70));
        Assert.assertEquals(1, stockSpanner.next(60));
        Assert.assertEquals(4, stockSpanner.next(75));
        Assert.assertEquals(6, stockSpanner.next(85));
    }
}
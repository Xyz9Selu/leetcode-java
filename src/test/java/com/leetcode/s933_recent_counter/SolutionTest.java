package com.leetcode.s933_recent_counter;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void recentCounterTest() {
        RecentCounter counter = new RecentCounter();
        Assert.assertEquals(1, counter.ping(1));
        Assert.assertEquals(2, counter.ping(100));
        Assert.assertEquals(3, counter.ping(3001));
        Assert.assertEquals(3, counter.ping(3002));
    }
}
package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class KidsWithCandiesTest {

    @Test
    public void testAdd() {
        KidsWithCandies solution = new KidsWithCandies();
        Assert.assertArrayEquals(new Boolean[]{true,true,true,false,true}, solution.kidsWithCandies(new int[]{2,3,5,1,3}, 3).toArray(new Boolean[0]));
        Assert.assertArrayEquals(new Boolean[]{true,false,false,false,false}, solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1).toArray(new Boolean[0]));
        Assert.assertArrayEquals(new Boolean[]{true,false,true}, solution.kidsWithCandies(new int[]{12,1,12}, 10).toArray(new Boolean[0]));
    }
}
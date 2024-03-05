package com.leetcode.m2336_smallest_infinite_set;

import org.junit.Test;
import org.junit.Assert;

public class SmallestInfiniteSetTest {
    @Test
    public void smallestInfiniteSetTest() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);    // 2 已经在集合中，所以不做任何变更。
        Assert.assertEquals(1, smallestInfiniteSet.popSmallest()); // 返回 1 ，因为 1 是最小的整数，并将其从集合中移除。
        Assert.assertEquals(2, smallestInfiniteSet.popSmallest()); // 返回 2 ，并将其从集合中移除。
        Assert.assertEquals(3, smallestInfiniteSet.popSmallest()); // 返回 3 ，并将其从集合中移除。
        smallestInfiniteSet.addBack(1);    // 将 1 添加到该集合中。
        Assert.assertEquals(1, smallestInfiniteSet.popSmallest()); // 返回 1 ，因为 1 在上一步中被添加到集合中，
                                        // 且 1 是最小的整数，并将其从集合中移除。
        Assert.assertEquals(4, smallestInfiniteSet.popSmallest()); // 返回 4 ，并将其从集合中移除。
        Assert.assertEquals(5, smallestInfiniteSet.popSmallest()); // 返回 5 ，并将其从集合中移除。
    }

    @Test
    public void smallestInfiniteSetTest2() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

        Assert.assertEquals(1, smallestInfiniteSet.popSmallest()); 
        Assert.assertEquals(2, smallestInfiniteSet.popSmallest()); 
        smallestInfiniteSet.addBack(3);    
        Assert.assertEquals(3, smallestInfiniteSet.popSmallest()); 
        smallestInfiniteSet.addBack(2);    
        Assert.assertEquals(2, smallestInfiniteSet.popSmallest()); 
        Assert.assertEquals(4, smallestInfiniteSet.popSmallest()); 
    }
}
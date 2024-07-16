package com.leetcode.m380_randomized_set;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class RandomizedSetTest {
    
    @Test
    public void testRandomizedSet() {
        RandomizedSet randomizedSet = new RandomizedSet();
        
        assertTrue(randomizedSet.insert(1)); // 返回 true
        assertFalse(randomizedSet.insert(1)); // 返回 false
        assertTrue(randomizedSet.insert(2)); // 返回 true
        assertTrue(randomizedSet.remove(1)); // 返回 true
        assertFalse(randomizedSet.remove(1)); // 返回 false
        assertFalse(randomizedSet.insert(2)); // 返回 false
        assertTrue(randomizedSet.insert(3)); // 返回 true
        
        int randomElement = randomizedSet.getRandom();
        assertTrue(randomElement == 2 || randomElement == 3); // 应返回 2 或 3
    }
}
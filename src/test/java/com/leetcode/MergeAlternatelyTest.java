package com.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeAlternatelyTest {

    @Test
    public void testAdd() {
        MergeAlternately solution = new MergeAlternately();
        assertEquals("apbqcr", solution.fmergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", solution.fmergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", solution.fmergeAlternately("abcd", "pq"));
    }
}

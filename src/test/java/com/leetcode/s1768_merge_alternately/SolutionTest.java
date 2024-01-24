package com.leetcode.s1768_merge_alternately;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testfmergeAlternately() {
        Solution solution = new Solution();
        assertEquals("apbqcr", solution.fmergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", solution.fmergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", solution.fmergeAlternately("abcd", "pq"));
    }
}

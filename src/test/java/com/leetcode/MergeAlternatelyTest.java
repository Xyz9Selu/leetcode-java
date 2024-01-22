package com.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeAlternatelyTest {

    @Test
    public void testAdd() {
        MergeAlternately solution = new MergeAlternately();
        assertEquals(solution.fmergeAlternately("abc", "pqr"), "apbqcr");
        assertEquals(solution.fmergeAlternately("ab", "pqrs"), "apbqrs");
        assertEquals(solution.fmergeAlternately("abcd", "pq"), "apbqcd");
    }
}

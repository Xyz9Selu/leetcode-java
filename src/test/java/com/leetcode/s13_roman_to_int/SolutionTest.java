package com.leetcode.s13_roman_to_int;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testRomanToInt() {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
    
    @Test
    public void testSingleCharacter() {
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(50, solution.romanToInt("L"));
        assertEquals(100, solution.romanToInt("C"));
        assertEquals(500, solution.romanToInt("D"));
        assertEquals(1000, solution.romanToInt("M"));
    }
    
    @Test
    public void testComplexCases() {
        assertEquals(49, solution.romanToInt("XLIX"));
        assertEquals(944, solution.romanToInt("CMXLIV"));
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }
}

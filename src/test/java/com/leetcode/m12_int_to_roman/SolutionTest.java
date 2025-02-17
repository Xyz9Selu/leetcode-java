package com.leetcode.m12_int_to_roman;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testIntToRoman() {
        assertEquals("MMMDCCXLIX", solution.intToRoman(3749));
        assertEquals("LVIII", solution.intToRoman(58));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
        assertEquals("III", solution.intToRoman(3));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
    }
    
    @Test
    public void testBoundaryCases() {
        assertEquals("I", solution.intToRoman(1));
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}
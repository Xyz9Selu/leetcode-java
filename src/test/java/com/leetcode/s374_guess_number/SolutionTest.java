package com.leetcode.s374_guess_number;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void guessNumberTest() {
        Assert.assertEquals(6, new Solution(6).guessNumber(10));
        Assert.assertEquals(1, new Solution(1).guessNumber(1));
        Assert.assertEquals(1, new Solution(1).guessNumber(2));
    }
}
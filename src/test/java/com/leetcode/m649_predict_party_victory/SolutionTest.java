package com.leetcode.m649_predict_party_victory;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void predictPartyVictoryTest() {
        Solution solution = new Solution();

        Assert.assertEquals("Radiant", solution.predictPartyVictory("RD"));
        Assert.assertEquals("Dire", solution.predictPartyVictory("RDD"));
    }
}
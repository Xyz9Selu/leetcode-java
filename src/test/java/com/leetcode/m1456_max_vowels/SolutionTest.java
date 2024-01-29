package com.leetcode.m1456_max_vowels;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
   @Test
   public void maxVowelsTeset() {
         Solution sol = new Solution();
         Assert.assertEquals(3, sol.maxVowels("abciiidef", 3));
         Assert.assertEquals(2, sol.maxVowels("aeiou", 2));
         Assert.assertEquals(2, sol.maxVowels("leetcode", 3));
         Assert.assertEquals(0, sol.maxVowels("rhythms", 4));
         Assert.assertEquals(1, sol.maxVowels("tryhard", 4));
   }

}
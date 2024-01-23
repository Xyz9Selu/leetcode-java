package com.leetcode;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int num: candies) {
            max = Math.max(max, num);
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
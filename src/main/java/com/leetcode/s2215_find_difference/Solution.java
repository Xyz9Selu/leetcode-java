package com.leetcode.s2215_find_difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int n: nums1) {
            s1.add(n);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int n: nums2) {
            s2.add(n);
        }

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<List<Integer>> result = Arrays.asList(result1, result2);

        for (int n: s1) {
            if (!s2.contains(n)) {
                result1.add(n);
            }
        }
        for (int n: s2) {
            if (!s1.contains(n)) {
                result2.add(n);
            }
        }

        return result;
    }

    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<List<Integer>> result = Arrays.asList(result1, result2);

        int[] status = new int[2001];

        for (int n: nums1) {
            status[n + 1000] = 1;
        }

        for (int n: nums2) {
            if (status[n + 1000] == 0) {
                result2.add(n);
            }

            status[n + 1000] = 2;
        }

        for (int n: nums1) {
            if(status[n + 1000] == 1) {
                result1.add(n);
            }

            status[n + 1000] = 0;
        }

        return result;
    }
}
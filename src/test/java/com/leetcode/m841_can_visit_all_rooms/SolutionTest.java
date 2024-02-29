package com.leetcode.m841_can_visit_all_rooms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class SolutionTest {
    private List<List<Integer>> toList(Integer[][] array) {
        List<List<Integer>> list = new ArrayList<>();

        for(Integer[] a: array) {
            list.add(Arrays.asList(a));
        }

        return list;
    }

    @Test
    public void canVisitAllRoomsTest() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.canVisitAllRooms(toList(new Integer[][]{{1}, {2}, {3}, {}})));
        Assert.assertFalse(solution.canVisitAllRooms(toList(new Integer[][]{{1,3},{3,0,1},{2},{0}})));
    }

    @Test
    public void canVisitAllRoomsTest2() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.canVisitAllRooms2(toList(new Integer[][]{{1}, {2}, {3}, {}})));
        Assert.assertFalse(solution.canVisitAllRooms2(toList(new Integer[][]{{1,3},{3,0,1},{2},{0}})));
    }
}
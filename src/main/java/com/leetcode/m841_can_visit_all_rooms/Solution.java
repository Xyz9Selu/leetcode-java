package com.leetcode.m841_can_visit_all_rooms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];

        dfs(rooms, 0, visited);

        for(int i: visited) {
            if (i == 0) {
                return false;
            }
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms, Integer i, int[] visited) {
        if (visited[i] == 1) {
            return;
        }

        visited[i] = 1;

        for (Integer n: rooms.get(i)) {
            dfs(rooms, n, visited);
        }
    }

    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();

        dfs2(rooms, 0, visited);

        return visited.size() == rooms.size();
    }

    private void dfs2(List<List<Integer>> rooms, Integer i, Set<Integer> visited) {
        if (visited.contains(i)) {
            return;
        }

        visited.add(i);

        for (Integer n: rooms.get(i)) {
            dfs2(rooms, n, visited);
        }
    }
}
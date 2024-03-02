package com.leetcode.m1466_min_reorder;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int minReorder(int n, int[][] connections) {
        // convert connections to adjacency list
        // keep connections into map for simple
        List<List<Integer>> adjList = new ArrayList<>();
        List<List<Boolean>> dirList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            adjList.add(new ArrayList<>());
            dirList.add(new ArrayList<>());
        }

        for (int[] conn: connections) {
            int from = conn[0];
            int to = conn[1];
            adjList.get(from).add(to);
            dirList.get(from).add(true);
            adjList.get(to).add(from);
            dirList.get(to).add(false);
        }

        // triverse the diagram
        int[] visited = new int[n];

        return dfs(0, adjList, dirList, visited);
    }

    private int dfs(int from, List<List<Integer>> adjList, List<List<Boolean>> dirList, int[] visited) {
        visited[from] = 1;

        int count = 0;
        List<Integer> neighbours = adjList.get(from);
        List<Boolean> directions = dirList.get(from);
        for (int i = 0; i < neighbours.size(); i ++) {
            int neighbour = neighbours.get(i);
            boolean direction = directions.get(i);
            if (visited[neighbour] == 0) {
                count += (direction? 1: 0);
                count += dfs(neighbours.get(i), adjList, dirList, visited);
            }
        }

        return count;
    }

}

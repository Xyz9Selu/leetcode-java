package com.leetcode.m547_find_circle_num;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i ++) {
            if (visited[i] == 0) {
                dfs(isConnected, i, visited);
                count ++;
            }
        }

        return count;
    }

    private void dfs(int[][] isConnected, int i, int[] visited) {
        visited[i] = 1;
        for (int j = 0; j < isConnected[i].length; j ++) {
            if (visited[j] == 0 && isConnected[i][j] == 1) {
                dfs(isConnected, j, visited);
            }
        }
    }
}
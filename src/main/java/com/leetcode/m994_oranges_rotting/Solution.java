package com.leetcode.m994_oranges_rotting;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int xSize = grid.length;
        int ySize = grid[0].length;
        // find rotten orange
        // calculate healthy orange count
        int healthyCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                if (grid[x][y] == 1) {
                    healthyCount++;
                } else if (grid[x][y] == 2) {
                    queue.offer(new int[]{x, y, 0});
                }
            }
        }

        // triverse by depth
        boolean[][] visited = new boolean[xSize][ySize];
        int[][] directions = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        int minute = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] direction : directions) {
                int newX = curr[0] + direction[0];
                int newY = curr[1] + direction[1];
                int newM = curr[2] + 1;

                if (newX >= 0 && newX < xSize && newY >= 0 && newY < ySize && grid[newX][newY] == 1
                        && !visited[newX][newY]) {
                    healthyCount--;
                    visited[newX][newY] = true;
                    minute = newM;

                    queue.offer(new int[] { newX, newY, newM });
                }
            }
        }

        return healthyCount == 0? minute: -1;
    }
}

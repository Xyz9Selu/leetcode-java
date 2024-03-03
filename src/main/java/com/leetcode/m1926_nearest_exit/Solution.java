package com.leetcode.m1926_nearest_exit;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int xSize = maze.length;
        int ySize = maze[0].length;
        boolean[][] visited = new boolean[xSize][ySize];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{entrance[0], entrance[1], 0});
        visited[entrance[0]][entrance[1]] = true;

        // 4 directions
        int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            // tell is exit
            if ((curr[0] == 0 || curr[1] == 0 || curr[0] == xSize - 1 || curr[1] == ySize - 1) && (curr[0] != entrance[0] || curr[1] != entrance[1])) {
                return curr[2];
            }

            // test 4 directions
            for (int[] direction: directions) {
                int newX = curr[0] + direction[0];
                int newY = curr[1] + direction[1];
                int newStep = curr[2] + 1;

                if (0 <= newX && newX < xSize && 0 <= newY && newY < ySize && !visited[newX][newY] && maze[newX][newY] != '+') {
                    queue.offer(new int[]{newX, newY, newStep});
                    visited[newX][newY] = true;
                }
            }
        }

        return -1;
    }
}

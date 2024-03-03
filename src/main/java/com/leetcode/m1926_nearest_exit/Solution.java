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

            // test 4 directions
            for (int[] direction: directions) {
                int newX = curr[0] + direction[0];
                int newY = curr[1] + direction[1];
                int newStep = curr[2] + 1;

                if (newX < 0 || newX >= xSize || newY < 0 || newY >= ySize || visited[newX][newY] || maze[newX][newY] == '+') {
                    continue;
                }

                if (newX == 0 || newX == xSize - 1 || newY == 0 || newY == ySize - 1) {
                    return newStep;
                }

                queue.offer(new int[]{newX, newY, newStep});
                visited[newX][newY] = true;
            }
        }

        return -1;
    }
}

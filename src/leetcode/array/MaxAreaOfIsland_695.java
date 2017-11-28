package leetcode.array;

public class MaxAreaOfIsland_695 {

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                int result = searchIsland(grid, i, j, visited);
                max = result > max ? result : max;
            }
        }
        return max;
    }

    private int searchIsland(int[][] grid, int i, int j, boolean[][] visited) {
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || grid[i][j] == 0
                || visited[i][j]) {
            return 0;
        }

        int result = 1;
        visited[i][j] = true;
        result += searchIsland(grid, i + 1 , j, visited) + searchIsland(grid, i , j + 1, visited) + searchIsland(grid, i - 1 , j, visited) + searchIsland(grid, i , j - 1, visited);
        return result;
    }

    public static void main(String[] args) {

    }

}

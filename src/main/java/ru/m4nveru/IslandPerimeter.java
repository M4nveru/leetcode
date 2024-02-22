package ru.m4nveru;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 0){
                    perimeter += 4
                            - (i - 1 == -1 ? 0 : grid[i-1][j])
                            - (i + 1 == grid.length ? 0 : grid[i+1][j])
                            - (j - 1 == -1 ? 0 : grid[i][j-1])
                            - (j + 1 == grid[0].length ? 0 :grid[i][j+1]);
                }
            }
        }
        return perimeter;
    }
}

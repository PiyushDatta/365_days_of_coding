
// Day 31 - Determine the perimeter of the island
// June 22nd, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n**2), 207ms Solution

public class Day31_IslandPerimeter {   
    public int islandPerimeter(int[][] grid) {
    
        int counter = 0;
    
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    counter += 4;
                    if (j != 0 && grid[i][j - 1] == 1) {
                        counter--;
                    }
                    if (j != grid[0].length - 1 && grid[i][j + 1] == 1) {
                        counter--;
                    }
                    if (i != 0 && grid[i - 1][j] == 1) {
                        counter--;
                    }
                    if (i != grid.length - 1 && grid[i + 1][j] == 1) {
                        counter--;
                    }
                }
            }
        }
    
        return counter;
    }

    public static void main(String[] args) {
        Day31_IslandPerimeter c = new Day31_IslandPerimeter();
        int[][] grid1 = {
                {1, 1, 1, 1},
                {1, 1, 1, 0},
                {1, 1, 1, 0},
                {1, 1, 1, 0}
        };
        System.out.println(c.islandPerimeter(grid1));
        // Should print out 16
    }
}

package SS3;

public class Array2DWithDifferentLength {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9},
            };

        for (int y = 0; y < grid.length; ++y) {
            for (int x = 0; x < grid[y].length; ++x) { System.out.printf("%2d",grid[y][x]);
            }
            System.out.println();
        }

        int[][] gridl = new int[3][];
        gridl[0] = new int[2];
        gridl[1] = new int[3];
        gridl[2] = new int[4];

        for (int y = 0; y < gridl.length; ++y) {
            for (int x = 0; x < gridl[y].length; ++x) { System.out.printf("%2d", gridl[y][x]);
            }
            System.out.println();
        }
}

    }

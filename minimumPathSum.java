//Minimum Path Sum
//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
//Note: You can only move either down or right at any point in time.

//solution 1
class minimumPathSum {
	static int minPathSum(int[][] grid) {
		if ((grid == null) || (grid.length == 0) || (grid[0] == null) || (grid[0].length == 0)) {
			throw new IllegalArgumentException("");
		}
		for (int i = 1; i <= grid.length - 1; i++) {
			grid[i][0] = grid[i][0] + grid[i - 1][0];
		}
		for (int j = 1; j <= grid[0].length - 1; j++) {
			grid[0][j] = grid[0][j] + grid[0][j - 1];
		}
		for (int i = 1; i <= grid.length - 1; i++)
			for (int j = 1; j <= grid[0].length - 1; j++) {
				grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
			}
		return grid[grid.length - 1][grid[0].length - 1];
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3},
			{0, 5, 6},
			{7, 8, 9}
		};
		System.out.println(minPathSum(a));
	}
}

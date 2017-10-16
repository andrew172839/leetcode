//Unique Paths II
//Follow up for "Unique Paths":
//Now consider if some obstacles are added to the grids. How many unique paths would there be?
//An obstacle and empty space is marked as 1 and 0 respectively in the grid.
//For example,
//    There is one obstacle in the middle of a 3x3 grid as illustrated below.
//    [
//    [0,0,0],
//    [0,1,0],
//    [0,0,0]
//    ]
//    The total number of unique paths is 2.
//    Note: m and n will be at most 100.

//solution 1
public class uniquePathsII {
	static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0) {
			return -1;
		}
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if (obstacleGrid[0][0] == 1) {
			obstacleGrid[0][0] = 0;
		}
		else {
			obstacleGrid[0][0] = 1;
		}
		for (int i = 1; i <= m - 1; i++) {
			if (obstacleGrid[i][0] == 1) {
				obstacleGrid[i][0] = 0;
			}
			else {
				obstacleGrid[i][0] = obstacleGrid[i - 1][0];
			}
		}
		for (int j = 1; j <= n - 1; j++) {
			if (obstacleGrid[0][j] == 1) {
				obstacleGrid[0][j] = 0;
			}
			else {
				obstacleGrid[0][j] = obstacleGrid[0][j - 1];
			}
		}
		for (int i = 1; i <= m - 1; i++)
			for (int j = 1; j <= n - 1; j++) {
				if (obstacleGrid[i][j] == 1) {
					obstacleGrid[i][j] = 0;
				}
				else {
					obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
				}
			}
		return obstacleGrid[m - 1][n - 1];
	}
	public static void main(String[] args) {
		int[][] a = {
			{0, 1, 0},
			{0, 0, 0},
			{0, 1, 0}
		};
		System.out.println(uniquePathsWithObstacles(a));
	}
}

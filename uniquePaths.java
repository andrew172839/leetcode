//Unique Paths
//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//How many possible unique paths are there?

//solution 1
class uniquePaths {
	static int uniquePaths(int m, int n) {
		if ((m <= 0) || (n <= 0)) {
			throw new IllegalArgumentException("");
		}
		int[][] result = new int[m][n];
		for (int i = 0; i <= m - 1; i++) {
			result[i][0] = 1;
		}
		for (int j = 0; j <= n - 1; j++) {
			result[0][j] = 1;
		}
		for (int i = 1; i <= m - 1; i++)
			for (int j = 1; j <= n - 1; j++) {
				result[i][j] = result[i - 1][j] + result[i][j - 1];
			}
		return result[m - 1][n - 1];
	}
	public static void main(String[] args) {
		System.out.println(uniquePaths(1, 1));
	}
}

//solution 2
class uniquePaths {
	static int uniquePaths(int m, int n) {
		if ((m <= 0) || (n <= 0)) {
			throw new IllegalArgumentException("");
		}
		int[] array = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			array[i] = 1;
		}
		for (int i = 1; i <= m - 1; i++)
			for (int j = 1; j <= n - 1; j++) {
				array[j] = array[j - 1] + array[j];
			}
		return array[n - 1];
	}
	public static void main(String[] args) {
		System.out.println(uniquePaths(1, 1));
	}
}

//solution 3
class uniquePaths {
	static int uniquePaths(int m, int n) {
		if ((m <= 0) || (n <= 0)) {
			throw new IllegalArgumentException("");
		}
		if ((m == 1) || (n == 1)) {
			return 1;
		}
		return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
	}
	public static void main(String[] args) {
		System.out.println(uniquePaths(2, 2));
	}
}

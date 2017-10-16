//Set Matrix Zeroes
//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
//Follow up:
//Did you use extra space?
//A straight forward solution using O(mn) space is probably a bad idea.
//A simple improvement uses O(m + n) space, but still not the best solution.
//Could you devise a constant space solution?

//solution 1
class setMatrixZeroes {
	static void setZero(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		boolean rowZero = false;
		boolean columnZero = false;
		for (int j = 0; j <= column - 1; j++) {
			if (matrix[0][j] == 0) {
				rowZero = true;
				break;
			}
		}
		for (int i = 0; i <= row - 1; i++) {
			if (matrix[i][0] == 0) {
				columnZero = true;
				break;
			}
		}
		for (int i = 1; i <= row - 1; i++) {
			for (int j = 1; j <= column - 1; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for (int i = 1; i <= row - 1; i++) {
			for (int j = 1; j <= column - 1; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (rowZero) {
			for (int j = 0; j <= column - 1; j++) {
				matrix[0][j] = 0;
			}
		}
		if (columnZero) {
			for (int i = 0; i <= row - 1; i++) {
				matrix[i][0] = 0;
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3},
			{0, 5, 6},
			{7, 8, 9}
		};
		setZero(a);
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}

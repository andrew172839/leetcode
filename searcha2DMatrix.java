//Search a 2D Matrix
//Question：
//Write an efficient algorithm that searches for a value in an  m  x  n  matrix. This matrix has the following properties:
//•   Integers in each row are sorted from left to right.
//•   The first integer of each row is greater than the last integer of the previous row.
//For example,
//    Consider the following matrix:
//    [
//    [1,   3,  5,  7],
//    [10, 11, 16, 20],
//    [23, 30, 34, 50]
//    ]
//    Given  target  =  3 , return  true .

//solution 1    
class searchA2DMatrix {
	static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new IllegalArgumentException();
		}
		int row = matrix.length;
		int column = matrix[0].length;
		int start = 0;
		int end = row * column - 1;
		while (end - start >= 2) {
			int middle = start + (end - start) / 2;
			int value = matrix[middle / column][middle % column];
			if (target == value) {
				return true;
			}
			else if (target < value) {
				end = middle;
			}
			else {
				start = middle;
			}
		}
		if (matrix[start / column][start % column] == target) {
			return true;
		}
		else if (matrix[end / column][end % column] == target) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{11, 12, 13}
		};
		System.out.println(searchMatrix(a, 5));
	}
}

//solution 2
class searchA2DMatrix {
	static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new IllegalArgumentException();
		}
		int row = matrix.length;
		int column = matrix[0].length;
		int start = 0;
		int end = row - 1;
		while (end - start >= 2) {
			int middle = start + (end - start) / 2;
			if (target == matrix[middle][0]) {
				return true;
			}
			else if (target < matrix[middle][0]) {
				end = middle;
			}
			else {
				start = middle;
			}
		}
		int rowResult = 0;
		if (matrix[end][0] <= target) {
			rowResult = end;
		}
		else if (matrix[start][0] <= target) {
			rowResult = start;
		}
		else {
			return false;
		}
		start = 0;
		end = column - 1;
		while (end - start >= 2) {
			int middle = start + (end - start) / 2;
			if (target == matrix[rowResult][middle]) {
				return true;
			}
			else if (target < matrix[rowResult][middle]) {
				end = middle;
			}
			else {
				start = middle;
			}
		}
		if (matrix[rowResult][start] == target) {
			return true;
		}
		else if (matrix[rowResult][end] == target) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{11, 12, 13}
		};
		System.out.println(searchMatrix(a, 5));
	}
}

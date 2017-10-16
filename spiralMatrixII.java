//Spiral Matrix II
//Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//For example, Given n = 3,
//    You should return the following matrix:
//    [
//    [ 1, 2, 3 ],
//    [ 8, 9, 4 ],
//    [ 7, 6, 5 ]
//    ]

//solution 1
class spiralMatrixII {
	static int[][] generateMatrix(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		int[][] result = new int[n][n];
		int begin = 0;
		int end = n - 1;
		int number = 0;
		while (begin <= end) {
			for (int i = begin; i <= end; i++) {
				number++;
				result[begin][i] = number;
			}
			for (int i = begin + 1; i <= end - 1; i++) {
				number++;
				result[i][end] = number;
			}
			if (begin != end) {
				for (int i = end; i >= begin; i--) {
					number++;
					result[end][i] = number;
				}
				for (int i = end - 1; i >= begin + 1; i--) {
					number++;
					result[i][begin] = number;
				}
			}
			begin++;
			end--;
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] matrix = generateMatrix(3);
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
}

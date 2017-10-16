//Rotate Image
//You are given an n x n 2D matrix representing an image.
//Rotate the image by 90 degrees (clockwise).
//Follow up:
//Could you do this in-place?

//solution 1
class rotateImage {
	static void rotate(int[][] matrix) {
		int len = matrix.length;
		for (int i = 0; i <= len / 2 - 1; i++) {
			for (int j = 0; j <= len - 1; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[len - 1 - i][j];
				matrix[len - 1 - i][j] = temp;
			}
		}
		for (int i = 0; i <= len - 1; i++) {
			for (int j = i + 1; j <= len - 1; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		rotate(a);
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}

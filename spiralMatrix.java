//Spiral Matrix
//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//For example,
//    Given the following matrix:
//    [
//    [ 1, 2, 3 ],
//    [ 4, 5, 6 ],
//    [ 7, 8, 9 ]
//    ]
//    You should return [1,2,3,6,9,8,7,4,5].

//solution 1
import java.util.ArrayList;
class spiralMatrix {
	static ArrayList<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int x = 0;
		int y = 0;
		if (matrix.length == 0 || matrix == null) {
			return result;
		}
		while (m >= 1 && n >= 1) {
			if (m == 1) {
				for (int i = 0; i <= n - 1; i++)
					result.add(matrix[x][y++]);
				break;
			}
			if (n == 1) {
				for (int i = 0; i < m - 1; i++)
					result.add(matrix[x++][y]);
				break;
			}
			for (int i = 0; i <= n - 2; i++)
				result.add(matrix[x][y++]);
			for (int i = 0; i <= m - 2; i++)
				result.add(matrix[x++][y]);
			for (int i = 0; i <= n - 2; i++)
				result.add(matrix[x][y--]);
			for (int i = 0; i <= m - 2; i++)
				result.add(matrix[x--][y]);
			x++;
			y++;
			m = m - 2;
			n = n - 2;
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3, 30},
			{4, 5, 6, 60},
			{7, 8, 9, 90}
		};
		System.out.println(spiralOrder(a));
	}
}

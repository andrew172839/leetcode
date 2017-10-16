//Triangle
//Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
//For example, given the following triangle
//[
//[2],
//    [3,4],
//    [6,5,7],
//    [4,1,8,3]
//    ]
//    The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
//    Note:
//    Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.

//solution 1
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;
public class triangle {
	static int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 1) {
			return triangle.get(0).get(0);
		}
		int[] result = new int[triangle.size()];
		for (int i = 0; i <= triangle.size() - 1; i++) {
			result[i] = triangle.get(triangle.size() - 1).get(i);
		}
		for (int i = triangle.size() - 2; i >= 0; i--)
			for (int j = 0; j <= triangle.get(i).size() - 1; j++) {
				result[j] = Math.min(result[j], result[j + 1]) + triangle.get(i).get(j);
			}
		return result[0];
	}
	static void main(String[] args) {
		List<List<Integer>> list = asList(
				asList(2),
				asList(3, 4),
				asList(6, 5, 7),
				asList(4, 1, 8, 3));
		System.out.println(minimumTotal(list));
	}
}

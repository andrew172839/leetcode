//Pascal's Triangle
//Given numRows, generate the first numRows of Pascal's triangle.
//For example, given numRows = 5,
//    Return
//    [
//    [1],
//    [1,1],
//    [1,2,1],
//    [1,3,3,1],
//    [1,4,6,4,1]
//    ]

//solution 1
import java.util.ArrayList;
class pascalsTriangle {
	static ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= numRows - 1; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			row.add(1);
			if (i >= 1) {
				for (int j = 0; j <= result.get(i - 1).size() - 2; j++) {
					row.add(result.get(i - 1).get(j) + result.get(i - 1).get(j + 1));
				}
				row.add(1);
			}
			result.add(row);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
}

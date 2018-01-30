//Subsets
//Given a set of distinct integers, S, return all possible subsets.
//Note: 1) Elements in a subset must be in non-descending order. 2) The solution set must not contain duplicate subsets.
//For example, given S = [1,2,3], the method returns:
//[
//[3],
//    [1],
//    [2],
//    [1,2,3],
//    [1,3],
//    [2,3],
//    [1,2],
//    []
//    ]

//solution 1
import java.util.ArrayList;
import java.util.Arrays;
class subsets {
	static void dfs(int nums[], ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result, int position) {
		result.add(new ArrayList<Integer>(path));
		for (int i = position; i <= nums.length - 1; i++) {
			path.add(nums[i]);
			dfs(nums, path, result, i + 1);
			path.remove(path.size() - 1);
		}
	}
	static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
		if ((nums == null) || (nums.length == 0)) {
			throw new IllegalArgumentException();
		}
		Arrays.sort(nums);
		ArrayList<Integer> path = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		dfs(nums, path, result, 0);
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		System.out.println(subsets(a));
	}
}

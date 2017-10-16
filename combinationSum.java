//Combination Sum
//Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
//The same repeated number may be chosen from C unlimited number of times.
//Note:
//All numbers (including target) will be positive integers.
//Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//The solution set must not contain duplicate combinations.
//For example, given candidate set 2,3,6,7 and target 7,
//    A solution set is:
//    [7]
//    [2, 2, 3]

//solution 1 
import java.util.ArrayList;
import java.util.Arrays;
class combinationSum {
	static void dfs(int[] candidates, int target, int position, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
		for (int i = position; i <= candidates.length - 1; i++) {
			if (target == 0) {
				result.add(new ArrayList<Integer>(list));
				return;
			}
			if (target < candidates[i]) {
				break;
			}
			if (i >= 1 && candidates[i - 1] == candidates[i]) {
				continue;
			}
			list.add(candidates[i]);
			dfs(candidates, target - candidates[i], i, list, result);
			list.remove(list.size() - 1);
		}
	}
	static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		if (candidates == null || candidates.length == 0) {
			return null;
		}
		Arrays.sort(candidates);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		dfs(candidates, target, 0, list, result);
		return result;
	}
	public static void main(String[] args) {
		int[] a = {2, 2, 2, 3, 6, 7};
		int target = 7;
		System.out.println(combinationSum(a, target));
	}
}

//solution 2
import java.util.ArrayList;
import java.util.Arrays;
class combinationSum {
	static void dfs(int[] candidates, int target, int position, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
		for (int i = position; i <= candidates.length - 1; i++) {
			if (target == 0 && result.contains(list) == false) {
				result.add(new ArrayList<Integer>(list));
				return;
			}
			if (target < candidates[i]) {
				continue;
			}
			list.add(candidates[i]);
			dfs(candidates, target - candidates[i], i, list, result);
			list.remove(list.size() - 1);
		}
	}
	static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		if (candidates == null || candidates.length == 0) {
			return null;
		}
		Arrays.sort(candidates);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		dfs(candidates, target, 0, list, result);
		return result;
	}
	public static void main(String[] args) {
		int[] a = {2, 2, 2, 3, 6, 7};
		int target = 7;
		System.out.println(combinationSum(a, target));
	}
}

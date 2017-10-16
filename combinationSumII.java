//Combination Sum II
//Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
//Each number in C may only be used once in the combination.
//Note:
//All numbers (including target) will be positive integers.
//Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//The solution set must not contain duplicate combinations.
//For example, given candidate set 10,1,2,7,6,1,5 and target 8,
//    A solution set is:
//    [1, 7]
//    [1, 2, 5]
//    [2, 6]
//    [1, 1, 6]

//solution 1
import java.util.ArrayList;
import java.util.Arrays;
class combinationSumII {
	static void dfs(int[] candidates, int target, int position, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
		int previous = -1;
		for (int i = position; i <= candidates.length - 1; i++) {
			if (i >= candidates.length) {
				return;
			}
			if (target == 0) {
				result.add(new ArrayList<Integer>(list));
				return;
			}
			if (target < candidates[i]) {
				break;
			}
			if (candidates[i] == previous) {
				continue;
			}
			list.add(candidates[i]);
			dfs(candidates, target - candidates[i], i + 1, list, result);
			list.remove(list.size() - 1);
			previous = candidates[i];
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
		int[] a = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		System.out.println(combinationSum(a, target));
	}
}

//solution 2
import java.util.ArrayList;
import java.util.Arrays;
class combinationSumII {
	static void dfs(int[] candidates, int target, int position, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
		for (int i = position; i <= candidates.length - 1; i++) {
			if (i >= candidates.length) {
				return;
			}
			if (target == 0 && result.contains(list) == false) {
				result.add(new ArrayList<Integer>(list));
				return;
			}
			if (target < candidates[i]) {
				break;
			}
			list.add(candidates[i]);
			dfs(candidates, target - candidates[i], i + 1, list, result);
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
		int[] a = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		System.out.println(combinationSum(a, target));
	}
}

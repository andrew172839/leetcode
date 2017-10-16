//3Sum
//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//Note:
//Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
//    The solution set must not contain duplicate triplets.
//    For example, given array S = {-1 0 1 2 -1 -4},
//    A solution set is:
//    (-1, 0, 1)
//(-1, -1, 2)

//solution 1
import java.util.Arrays;
import java.util.ArrayList;
class 3sum {
	static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (num == null || num.length <= 2) {
			return result;
		}
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++)
			for (int j = i + 1; j < num.length -1; j++)
				for (int k = j + 1; k < num.length; k++) {
					if (num[i] + num[j] + num[k] == 0) {
						ArrayList<Integer> item = new ArrayList<Integer>();
						item.add(num[i]);
						item.add(num[j]);
						item.add(num[k]);
						if (result.contains(item) == false) {
							result.add(item);
						}
					}
				}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {-4, -1, -1, 0, 1, 2};
		System.out.println(threeSum(a));
	}
}

//solution 2
import java.util.ArrayList;
import java.util.Arrays;
class 3sum {
	static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (num == null || num.length <= 2) {
			return result;
		}
		Arrays.sort(num);
		for (int i = num.length - 1; i >= 2; i--) {
			if (i < num.length - 1 && num[i] == num[i + 1]) {
				continue;
			}
			ArrayList<ArrayList<Integer>> currentResult = twoSum(num, i - 1, -num[i]);
			for (int j = 0; j <= currentResult.size() - 1; j++)
			{
				currentResult.get(j).add(num[i]);
			}
			result.addAll(currentResult);
		}
		return result;
	}
	static ArrayList<ArrayList<Integer>> twoSum(int[] num, int end, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (num == null || num.length <= 1) {
			return result;
		}
		int l = 0;
		int r = end;
		while (l < r)
		{
			if (num[l] + num[r] == target)
			{
				ArrayList<Integer> item = new ArrayList<Integer>();
				item.add(num[l]);
				item.add(num[r]);
				result.add(item);
				l++;
				r--;
				while (l < r && num[l] == num[l - 1]) {
					l++;
				}
				while (l < r && num[r] == num[r + 1]) {
					r--;
				}
			}
			else if (num[l] + num[r] > target)
			{
				r--;
			}
			else
			{
				l++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(a));
	}
}

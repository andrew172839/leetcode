//3Sum Closest
//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//For example, given array S = {-1 2 1 -4}, and target = 1.
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

//solution 1
import java.util.Arrays;
class 3sumClosest {
	static int threeSumClosest(int[] num, int target) {
		if (num == null || num.length <= 2) {
			return Integer.MIN_VALUE;
		}
		Arrays.sort(num);
		int closest = num[0] + num[1] + num[2] - target;
		for (int i = 0; i <= num.length - 3; i++) {
			int current = twoSum(num, target - num[i], i + 1);
			if (Math.abs(current) < Math.abs(closest)) {
				closest = current;
			}
		}
		return closest + target;
	}
	static int twoSum(int[] num, int target, int start) {
		if (num == null || num.length <= 1) {
			return Integer.MIN_VALUE;
		}
		int l = start;
		int r = num.length - 1;
		int closest = num[start] + num[start + 1] - target;
		while (l < r) {
			if (num[l] + num[r] == target) {
				return 0;
			}
			if (Math.abs(num[l] + num[r] - target) < Math.abs(closest)) {
				closest = num[l] + num[r] - target;
			}
			if (num[l] + num[r] < target) {
				l++;
			}
			if (num[l] + num[r] > target) {
				r--;
			}
		}
		return closest;
	}
	public static void main(String[] args) {
		int[] a = {-1, 2, 1, -4};
		System.out.println(threeSumClosest(a, 1));
	}
}

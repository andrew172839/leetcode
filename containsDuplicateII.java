//Contains Duplicate II
//Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

//solution 1
import java.util.HashMap;
class containsDuplicateII {
	static boolean containsDuplicate(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("");
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <= nums.length - 1; i++) {
			if (map.containsKey(nums[i]) == true) {
				if (Math.abs(map.get(nums[i]) - i) <= k) {
					return true;
				}
				else {
					map.put(nums[i], i);
				}
			}
			else {
				map.put(nums[i], i);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 1, 5, 6, 1};
		System.out.println(containsDuplicate(a, 3));
	}
}

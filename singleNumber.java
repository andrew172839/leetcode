//Single Number
//Given an array of integers, every element appears twice except for one. Find that single one.
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

//solution 1
class singleNumber {
	static int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("");
		}
		int result = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			result = result ^ nums[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {3, 2, 2, 1, 3};
		System.out.println(singleNumber(a));
	}
}

//solution 2
import java.util.HashMap;
class singleNumber {
	static int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("");
		}
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i <= nums.length - 1; i++) {
			if (hashmap.containsKey(nums[i]) == false) {
				hashmap.put(nums[i], 1);
			}
			else {
				hashmap.put(nums[i], hashmap.get(nums[i]) + 1);
			}
		}
		int result = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (hashmap.get(nums[i]) == 1) {
				result = nums[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {3, 2, 2, 1, 3};
		System.out.println(singleNumber(a));
	}
}

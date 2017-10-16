//Contains Duplicate
//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

//solution 1
import java.util.ArrayList;
class containsDuplicate {
	static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= nums.length - 1; i++) {
			if (list.contains(nums[i]) == true) {
				return true;
			}
			else {
				list.add(nums[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(containsDuplicate(a));
	}
}

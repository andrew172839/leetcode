//Search for a Range
//Given a sorted array of integers, find the starting and ending position of a given target value.
//Your algorithm's runtime complexity must be in the order of O(log n).
//If the target is not found in the array, return [-1, -1].
//For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].

//solution 1
import java.util.Arrays;
class searchForARange {
	static int[] searchRange(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException();
		}
		int[] result = new int[2];
		int start = 0;
		int end = nums.length - 1;
		while (end - start >= 2) {
			int middle = start + (end - start) / 2;
			if (nums[middle] == target) {
				end = middle;
			}
			else if (nums[middle] < target) {
				start = middle;
			}
			else {
				end = middle;
			}
		}
		if (nums[start] == target) {
			result[0] = start;
		}
		else if (nums[end] == target) {
			result[0] = end;
		}
		else {
			result[0] = -1;
		}
		start = 0;
		end = nums.length - 1;
		while (end - start >= 2) {
			int middle = start + (end - start) / 2;
			if (nums[middle] == target) {
				start = middle;
			}
			else if (nums[middle] < target) {
				start = middle;
			}
			else {
				end = middle;
			}
		}
		if (nums[end] == target) {
			result[1] = end;
		}
		else if (nums[start] == target) {
			result[1] = start;
		}
		else {
			result[1] = -1;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 10)));
	}
}

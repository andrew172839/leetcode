//Search in Rotated Sorted Array
//Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//You are given a target value to search. If found in the array return its index, otherwise return -1.
//You may assume no duplicate exists in the array.

//solution 1
class searchInRotatedSortedArray {
	static int search(int[] nums, int target) {
		if ((nums == null) || (nums.length == 0)) {
			throw new IllegalArgumentException();
		}
		int start = 0;
		int end = nums.length - 1;
		while (end - start >= 2) {
			int middle = start + (end - start) / 2;
			if (nums[middle] == target) {
				end = middle;
			}
			else if (nums[start] <= nums[middle]) {
				if (target >= nums[start] && target < nums[middle]) {
					end = middle;
				}
				else {
					start = middle;
				}
			}
			else {
				if (target > nums[middle] && target <= nums[end]) {
					start = middle;
				}
				else {
					end = middle;
				}
			}
		}
		if (nums[start] == target) {
			return start;
		}
		else if (nums[end] == target) {
			return end;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
	}
}

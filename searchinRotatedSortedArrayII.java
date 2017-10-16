//Search in Rotated Sorted Array II
//Follow up for "Search in Rotated Sorted Array":
//What if duplicates are allowed?
//Would this affect the run-time complexity? How and why?
//Write a function to determine if a given target is in the array.

class searchInRotatedSortedArrayII {
	static boolean binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == target) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {0, 0, 1, 0, 0, 0, 0}, 1));
	}
}

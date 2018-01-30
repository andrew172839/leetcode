//Remove Duplicates from Sorted Array II
//Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
//For example, Given sorted array A = [1,1,1,2,2,3],
//    Your function should return length = 5, and A is now [1,1,2,2,3].

//solution 1
class removeDuplicatesFromSortedArrayII {
	static int removeDuplicates(int[] nums) {
		if ((nums == null) || (nums.length == 0)) {
			throw new IllegalArgumentException("");
		}
		int result = nums.length;
		for (int i = 0; i <= nums.length - 3; i++) {
			if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
				result--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 1, 3, 3, 3, 3, 4};
		System.out.println(removeDuplicates(a));
	}
}

//Remove Duplicates from Sorted Array
//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.
//For example,
//    Given input array A = [1,1,2],
//    Your function should return length = 2, and A is now [1,2].

//solution 1    
class removeDuplicatesFromSortedArray {
	static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("");
		}
		int result = nums.length;
		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] == nums[i + 1]) {
				result = result - 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 1, 1, 1, 1};
		System.out.println(removeDuplicates(a));
	}
}

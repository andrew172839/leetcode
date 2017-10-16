//Search Insert Position
//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You may assume no duplicates in the array.
//Here are few examples. [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7 → 4 [1,3,5,6], 0 → 0

//solution 1
class searchInsertPosition {
	static int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException();
		}
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
		if (nums[start] >= target) {
			return start;
		}
		else if (nums[end] >= target) {
			return end;
		}
		else {
			return nums.length;
		}
	}
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 5));
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 7));
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 0));
	}
}

//solution 2
class searchInsertPosition {
	static int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException();
		}
		int start = 0;
		int end = nums.length - 1;
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
			return end;
		}
		else if (nums[end] < target) {
			return end + 1;
		}
		else if (nums[start] == target) {
			return start;
		}
		else if (nums[start] < target) {
			return start + 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 5));
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 7));
		System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 0));
	}
}

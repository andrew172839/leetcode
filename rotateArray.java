//Rotate Array
//Rotate an array of n elements to the right by k steps.
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//Note:
//Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
//[show hint]
//Hint:
//Could you do it in-place with O(1) extra space?
//Related problem: Reverse Words in a String II

//solution 1
class rotateArray {
	static void rotate(int[] nums, int k) {
		if ((nums == null) || (nums.length == 0) || (k < 0)) {
			throw new IllegalArgumentException();
		}
		k = k % nums.length;
		for (; k >= 1; k--) {
			int temp = nums[nums.length - 1];
			for (int i = nums.length - 1; i >= 1; i--) {
				nums[i] = nums[i - 1];
			}
			nums[0] = temp;
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		rotate(a, 5);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}

//solution 2
class rotateArray {
	static void reverse(int[] nums, int left, int right) {
		int temp = 0;
		while (left <= right - 1) {
			temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
	static void rotate(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0) {
			throw new IllegalArgumentException();
		}
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		rotate(a, 5);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}

//solution 3
class rotateArray {
	static void rotate(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0) {
			throw new IllegalArgumentException();
		}
		int[] result = new int[nums.length];
		k = k % nums.length;
		for (int i = nums.length - 1; i >= k; i--) {
			result[i] = nums[i - k];
		}
		for (int i = 0; i <= k - 1; i++) {
			result[i] = nums[nums.length - k + i];
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		rotate(a, 4);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}

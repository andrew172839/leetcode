//Maximum Subarray
//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//For example, given the array [鈭�2,1,鈭�3,4,鈭�1,2,1,鈭�5,4],鈥╰he contiguous subarray [4,鈭�1,2,1] has the largest sum = 6.
//More practice:
//If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle

//solution 1
class maximumSubarray {
	static int maxSubArray(int[] a) {
		if ((a == null) || (a.length == 0)) {
			throw new IllegalArgumentException();
		}
		int resultEndedWithI = a[0];
		int result = a[0];
		for (int i = 1; i <= a.length - 1; i++) {
			resultEndedWithI = Math.max(a[i] + resultEndedWithI, a[i]);
			result = Math.max(result, resultEndedWithI);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {-1, 2, 0, -1, 1, 3};
		System.out.println(maxSubArray(a));
	}
}

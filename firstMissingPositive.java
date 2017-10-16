//First Missing Positive
//Given an unsorted integer array, find the first missing positive integer.
//For example,
//    Given [1,2,0] return 3,
//    and [3,4,-1,1] return 2.
//    Your algorithm should run in O(n) time and uses constant space.

//solution 1
class firstMissingPositive {
	static int firstMissingPositive(int[] A) {
		for (int i = 0; i <= A.length - 1; i++) {
			if (A[i] > 0 && A[i] <= A.length && A[i] != A[A[i] - 1]) {
				int temp = A[A[i] - 1];
				A[A[i] - 1] = A[i];
				A[i] = temp;
				i--;
			}
		}
		for (int i = 0; i <= A.length - 1; i++) {
			if (A[i] != i + 1) {
				return i + 1;
			}
		}
		return A.length + 1;
	}
	public static void main(String[] args) {
		int[] a = {3, 4, -1, 1};
		//int[] a = {1, 2, 0};
		System.out.println(firstMissingPositive(a));
	}
}

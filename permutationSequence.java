//Permutation Sequence
//The set [1,2,3,鈥�,n] contains a total of n! unique permutations.
//By listing and labeling all of the permutations in order,
//   We get the following sequence (ie, for n = 3):
//       "123"
//        "132"
//        "213"
//        "231"
//        "312"
//        "321"
//        Given n and k, return the kth permutation sequence.
//        Note: Given n will be between 1 and 9 inclusive.

//solution 1
import java.util.Arrays;
class permutationSequence {
	static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	static void reverse(int[] num, int i, int j) {
		while (i <= j - 1) {
			swap(num, i, j);
			i++;
			j--;
		}
	}
	static boolean nextPermute(int[] num) {
		if (num.length == 1) {
			return false;
		}
		int i = num.length - 2;
		while (true) {
			if (num[i] < num[i + 1]) {
				int j = num.length -1;
				while (num[i] >= num[j]) {
					j--;
				}
				swap(num, i, j);
				reverse(num, i + 1, num.length - 1);
				return true;
			}
			if (i == 0) {
				return false;
			}
			i--;
		}
	}
	static String getPermutation(int n, int k) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		if (k <= 0 || k > factorial) {
			return null;
		}
		int[] num = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			num[i] = i + 1;
		}
		for (int i = 1; i <= k - 1; i++) {
			nextPermute(num);
		}
		String result = "";
		for (int i = 0; i <= n - 1; i++) {
			result = result + num[i];
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getPermutation(3, 2));
	}
}

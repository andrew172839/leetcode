//Merge Sorted Array
//Given two sorted integer arrays A and B, merge B into A as one sorted array.
//Note:
//You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.

//solution 1
class mergeSortedArray {
	static void merge(int[] A, int m, int[] B, int n) {
		int index1 = m - 1;
		int index2 = n - 1;
		int length = m + n - 1;
		while ((index1 >= 0) && (index2 >= 0)) {
			if (A[index1] > B[index2]) {
				A[length] = A[index1];
				length--;
				index1--;
			}
			else {
				A[length] = B[index2];
				length--;
				index2--;
			}
		}
		while (index2 >= 0) {
			A[length] = B[index2];
			length--;
			index2--;
		}
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		int[] b = {4444, 555, 66, 7};
		merge(a, 3, b, 4);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(A[i]);
		}
	}
}

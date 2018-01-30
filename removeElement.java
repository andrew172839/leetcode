//Remove Element
//Given an array and a value, remove all instances of that value in place and return the new length.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.

//solution 1
class removeElement {
	static int removeElement(int A[], int element) {
		if ((A == null) || (A.length == 0)) {
			throw new IllegalArgumentException();
		}
		int result = 0;
		for (int i = 0; i <= A.length - 1; i++) {
			if (A[i] != element) {
				A[result] = A[i];
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(removeElement(a, 15));
	}
}

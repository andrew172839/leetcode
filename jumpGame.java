//Jump Game
//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//Each element in the array represents your maximum jump length at that position.
//Determine if you are able to reach the last index.
//For example:
//A = [2,3,1,1,4], return true.
//A = [3,2,1,0,4], return false.

//solution 1
class jumpGame {
	static boolean canJump(int[] A) {
		if (A.length == 0) {
			throw new IllegalArgumentException();
		}
		if (A.length == 1) {
			return true;
		}
		int marker = A.length - 1;
		for (int i = A.length - 2; i >= 0; i--) {
			if (A[i] >= marker - i) {
				marker = i;
			}
		}
		return marker == 0;
	}
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 1, 4};
		System.out.println(canJump(a));
	}
}

//solution 2
class jumpGame {
	static boolean canJump(int[] A) {
		if (A.length == 0) {
			throw new IllegalArgumentException();
		}
		if (A.length == 1) {
			return true;
		}
		int far = 0;
		for (int i = 0; i < A.length && i <= far; i++) {
			far = Math.max(far, A[i] + i);
		}
		return far >= A.length - 1;
	}
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 1, 4};
		System.out.println(canJump(a));
	}
}
